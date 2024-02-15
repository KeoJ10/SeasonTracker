import java.util.ArrayList;

public class PremiereLeague implements FootbalLeague {

    private String name;
    private int played;
    private int won;
    private int drawn;
    private int lost;
    private int goalsFor;
    private int goalsAgainst;
    private int points;

    public PremiereLeague(String name) {
        this.name = name;
    }


    @Override
    public int getWon() {
        return won;

    }

    @Override
    public int getDrawn() {
        return drawn;

    }

    @Override
    public int getLost() {
        return lost;

    }



    @Override
    public int getGoalsFor() {
        return goalsFor;

    }

    @Override
    public int getGoalsAgainst() {
        return goalsAgainst;

    }

    @Override
    public int getGoalDifference() {
        return goalsFor - goalsAgainst;

    }

    @Override
    public int getPlayed() {
        return played;

    }

    @Override
    public int getPoints() {
        return points;

    }

    @Override
    public void updateRankings(int rankings) {

    }

    public void pointsReturn(int goalsFor, int goalsAgainst){
        played++;
        this.goalsFor += goalsFor;
        this.goalsAgainst += goalsAgainst;

        if (goalsFor > goalsAgainst){
            won++;
             points += 3;

        } else if (goalsFor == goalsAgainst) {
            drawn++;
             points += 1;
        }

        else {
            lost++;
        }
    }



    ArrayList<Team> teamsInCompetition;
    }

