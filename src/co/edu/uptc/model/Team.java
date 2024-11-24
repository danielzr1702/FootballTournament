package co.edu.uptc.model;

public class Team {

    private String name;
    private Goalkeeper[] goalkeepers;
    private Defender[] defenders;
    private Midfielder[] midfielders;
    private Forward[] forwards;

    private int goalkeeperCount;
    private int defenderCount;
    private int midfielderCount;
    private int forwardCount;

    public Team(String name) {
        this.name = name;
        this.goalkeepers = new Goalkeeper[1];
        this.defenders = new Defender[4];
        this.midfielders = new Midfielder[3];
        this.forwards = new Forward[3];
        this.goalkeeperCount = 0;
        this.defenderCount = 0;
        this.midfielderCount = 0;
        this.forwardCount = 0;
    }

    public String getName() {
        return name;
    }

    public boolean addGoalkeeper(Goalkeeper goalkeeper) {
        if (goalkeeperCount < 1) {
            goalkeepers[goalkeeperCount++] = goalkeeper;
            return true;
        }
        return false;
    }

    public boolean addDefender(Defender defender) {
        if (defenderCount < 4) {
            defenders[defenderCount++] = defender;
            return true;
        }
        return false;
    }

    public boolean addMidfielder(Midfielder midfielder) {
        if (midfielderCount < 3) {
            midfielders[midfielderCount++] = midfielder;
            return true;
        }
        return false;
    }

    public boolean addForward(Forward forward) {
        if (forwardCount < 3) {
            forwards[forwardCount++] = forward;
            return true;
        }
        return false;
    }
    
}
