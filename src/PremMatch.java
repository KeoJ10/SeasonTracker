public class PremMatch implements Match{
    int awayGoals;
    int homeGoals;
    Team homeTeamName;
    Team awayTeam;

    public PremMatch(Team homeTeamName, Team awayTeam, int awayGoals, int homeGoals){
        this.awayGoals = awayGoals;
        this.homeGoals = homeGoals;
        this.homeTeamName = homeTeamName;
        this.awayTeam = awayTeam;



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
        return homeTeamName;
    }

    @Override
    public Team getHomeTeam() {
        return awayTeam;
    }
}
