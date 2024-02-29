public class PremTable {
    private Team homeTeam;
    private Team awayTeam;
    private int homeGoals;
    private int awayGoals;

    public static void main(String[] args) {
        // Creating teams
        Team manchesterCity = new PremiereLeague("Manchester City");
        Team liverpool = new PremiereLeague("Liverpool");
        Team chelsea = new PremiereLeague("Chelsea");

        // Creating matches
        Match match1 = new PremMatch(manchesterCity, liverpool, 3, 1);
        Match match2 = new PremMatch(liverpool, chelsea, 2, 2);
        Match match3 = new PremMatch(chelsea, manchesterCity, 1, 3);

        // Printing table
        premTable(manchesterCity, liverpool, chelsea);
    }


    public static void premTable(Team... teams) {
        System.out.println("Premier League table:");
        System.out.println("Season 2023-2034");
        System.out.println("| club | P | W | D | L | GF | GA | GD | PTS | \n");
        for (Team team : teams) {
            System.out.printf("| %-20s |  %-2d |  %-2d |  %-2d |  %-2d |  %-3d |  %-3d |  %-3d |\n",
                    team.getName(),
                    team.getPlayed(),
                    team.getWon(),
                    team.getDrawn(),
                    team.getLost(),
                    team.getGoalsFor(),
                    team.getGoalsAgainst(),
                    team.getGoalDifference(),
                    team.getPoints());

        }
        System.out.println("________________________________");
    }
}



