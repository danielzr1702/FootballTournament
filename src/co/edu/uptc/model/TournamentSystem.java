package co.edu.uptc.model;

public class TournamentSystem {
    private Tournament tournament;

    public void startTournament(int maxTeams) {
        tournament = new Tournament(maxTeams);
    }

    public boolean registerTeam(String teamName) {
        if (tournament == null) {
            throw new IllegalStateException("El torneo no ha iniciado.");
        }
        return tournament.addTeam(teamName);
    }

    public boolean registerPlayer(String teamName, Player player) {
        if (tournament == null) {
            throw new IllegalStateException("El torneo no ha iniciado.");
        }
        return tournament.addPlayer(teamName, player);
    }

    public String viewTournamentDetails() {
        return "";
    }
}
