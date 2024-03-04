public class PremTable {
    private Team homeTeam;
    private Team awayTeam;
    private int homeGoals;
    private int awayGoals;

    public static void main(String[] args) {

        Team manchesterCity = new PremiereLeague("Manchester City");
        Team liverpool = new PremiereLeague("Liverpool");
        Team chelsea = new PremiereLeague("Chelsea");


        Match match1 = new PremMatch(manchesterCity, liverpool, 3, 0);
        Match match2 = new PremMatch(liverpool, chelsea, 0, 2);
        Match match3 = new PremMatch(chelsea, manchesterCity, 1, 1);

        TopScorer salah = new PremTopScorer("Mohamed Salah");
        TopScorer haaland = new PremTopScorer("Erling Haaland");
        TopScorer nunez = new PremTopScorer("Darwin Nunez");
        TopScorer watkins = new PremTopScorer("Ollie Watkins");

        ((PremTopScorer)salah).goalsScoredAdd();
        ((PremTopScorer)salah).goalsScoredAdd();
        ((PremTopScorer)salah).goalsScoredAdd();
        ((PremTopScorer)nunez).goalsScoredAdd();
        ((PremTopScorer)nunez).goalsScoredAdd();
        ((PremTopScorer)haaland).goalsScoredAdd();
        ((PremTopScorer)haaland).goalsScoredAdd();
        ((PremTopScorer)watkins).goalsScoredAdd();





        premTable(liverpool, manchesterCity , chelsea);
        topScorerList(salah, haaland, nunez, watkins);





    }


    public static void premTable(Team... teams) {
        System.out.println("Premier League table:");
        System.out.println("Season 2023-2034");
        System.out.println("| club | P | W | D | L | GF | GA | GD | PTS | \n");
        for (Team team : teams) {
            System.out.printf("| %-20s |  %-2d |  %-2d |  %-2d |  %-2d |  %-3d |  %-3d |  %-3d | %-3d |\n",
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
    public static void topScorerList(TopScorer... scorer){
        System.out.println("2024 topScorers list");
        System.out.println("---------------------------");
       for (TopScorer scorers : scorer){
           System.out.printf("| %-15s | %-2d | \n",
                   scorers.getName(),
                   scorers.getGoalsScored());
       }
    }
}



