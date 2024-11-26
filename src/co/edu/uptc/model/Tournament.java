package co.edu.uptc.model;

import java.util.HashMap;
import java.util.Map;

public class Tournament {
    private Map<String, Team> teams; 
    private int maxTeams;

    public Tournament(int maxTeams) {
        if (maxTeams < 8 || maxTeams > 14) {
            throw new IllegalArgumentException("El numero de equipos debe ser entre 8 y 14.");
        }
        this.teams = new HashMap<>();
        this.maxTeams = maxTeams;
    }

    public boolean addTeam(String teamName) {
        if (teams.size() >= maxTeams) {
            return false; 
        }
        if (teams.containsKey(teamName)) {
            return false; 
        }
        teams.put(teamName, new Team(teamName));
        return true;
    }

    public boolean addPlayer(String teamName, Player player) {
        Team team = teams.get(teamName);
        if (team == null) {
            return false; 
        }
        switch (player.getPosition()) {
            case "Goalkeeper":
                return team.addGoalkeeper((Goalkeeper) player);
            case "Defender":
                return team.addDefender((Defender) player);
            case "Midfielder":
                return team.addMidfielder((Midfielder) player);
            case "Forward":
                return team.addForward((Forward) player);
            default:
                return false;
        }
    }

    public String getTeamsInfo() {
        StringBuilder info = new StringBuilder("Equipos:\n");
        for (Team team : teams.values()) {
            info.append(team.showTeamInfo()).append("\n");
        }
        return info.toString();
    }
}
