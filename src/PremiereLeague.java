import java.util.ArrayList;

public class PremiereLeague implements Team {

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


    public String getName() {
        return name;
    }




    public void recordMatchResult(int goalsFor, int goalsAgainst) {
        played++;
        this.goalsFor += goalsFor;
        this.goalsAgainst += goalsAgainst;

        if (goalsFor > goalsAgainst) {
            won++;
            points += 3;
        } else if (goalsFor < goalsAgainst) {
            lost++;
        } else {
            drawn++;
            points++;
        }
    }


    }






