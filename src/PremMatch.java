public class PremMatch implements Match{
    int awayGoals;
    int homeGoals;
    Team homeTeam;
    Team awayTeam;

    public PremMatch(Team homeTeamName, Team awayTeam, int awayGoals, int homeGoals){
        this.awayGoals = awayGoals;
        this.homeGoals = homeGoals;
        this.homeTeam = homeTeamName;
        this.awayTeam = awayTeam;
        homeTeam.recordMatchResult(homeGoals, awayGoals);
        awayTeam.recordMatchResult(awayGoals, homeGoals);



    }



    @Override
    public int getAwayGoals() {

        return awayGoals;
    }

    @Override
    public int getHomeGoals() {

        return homeGoals;
    }

    @Override
    public Team getAwayTeam() {

        return homeTeam;
    }

    @Override
    public Team getHomeTeam()
    {
        return awayTeam;
    }
}
