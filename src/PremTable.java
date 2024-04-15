public class PremTable {

    public static void main(String[] args) {

        Team manchesterCity = new PremiereLeague("Manchester City");
        Team liverpool = new PremiereLeague("Liverpool");
        Team chelsea = new PremiereLeague("Chelsea");
        Team astonVilla = new PremiereLeague("Aston villa");
        Team tottenHam = new PremiereLeague("Tottenham Hotspurs");
        Team arsenal = new PremiereLeague("Arsenal");
        Team westHam = new PremiereLeague("West Ham");
        Team burnley = new PremiereLeague("Burnley");
        Team manUnited = new PremiereLeague("Manchester United");
        Team brighton = new PremiereLeague("Brighton Hove Albion");
        Team wolves = new PremiereLeague("Wolverhampton");
        Team brentford = new PremiereLeague("Brentford");
        Team newcastle = new PremiereLeague("New Castle");
        Team fulham = new PremiereLeague("Fulham");
        Team bournemounth = new PremiereLeague("Bournemounth");
        Team crystalPalace = new PremiereLeague("Crystal Palace");
        Team everton = new PremiereLeague("Everton");
        Team forest = new PremiereLeague("Nottingham Forrest");
        Team luton = new PremiereLeague("Luton");
        Team sheffield = new PremiereLeague("Sheffield United");


        Match match1 = new PremMatch(manchesterCity, liverpool, 3, 0);
        Match match2 = new PremMatch(liverpool, chelsea, 0, 2);
        Match match3 = new PremMatch(chelsea, manchesterCity, 2, 1);
        Match match4 = new PremMatch(arsenal, fulham, 0, 4);
        Match match5 = new PremMatch(luton, sheffield, 2, 3);
        Match match6 = new PremMatch(newcastle, everton, 1, 3);

        PremTopScorer salah = new PremTopScorer("Mohamed Salah", 2 , 1);
        PremTopScorer haaland = new PremTopScorer("Erling Haaland", 2,0);
        PremTopScorer nunez = new PremTopScorer("Darwin Nunez", 1, 1);
        PremTopScorer watkins = new PremTopScorer("Ollie Watkins", 0, 1);



        salah.goalsScoredAdd();
        salah.goalsScoredAdd();
        salah.goalsScoredAdd();
        nunez.goalsScoredAdd();
        nunez.goalsScoredAdd();
        haaland.goalsScoredAdd();
        haaland.goalsScoredAdd();
        watkins.goalsScoredAdd();





        premTable(liverpool, arsenal, manchesterCity , chelsea,  astonVilla, tottenHam, manUnited, westHam, brighton, wolves, brentford, newcastle,
                fulham, bournemounth, crystalPalace, everton, luton, forest , sheffield, burnley);
        topScorerList(salah, nunez, haaland, watkins);





    }


    public static void premTable(Team... teams) {
        System.out.println("Premier League table:");
        System.out.println("Season 2023-2034");
        System.out.println("| club      | P | W | D | L | GF | GA | GD | PTS | \n");
        System.out.println("-------------------------------------------------------");
        for (Team team : teams) {
            System.out.printf("| %s |  %d |  %d |  %d |  %d |  %d |  %d |  %d | %d |\n",
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
        System.out.println("                | goals | left | right |");
       for (TopScorer scorers : scorer){
           System.out.printf("| %s | %d | | %d | %d |\n",
                   scorers.getName(),
                   scorers.getGoalsScored(),
                   scorers.getLeftFoot(),
                   scorers.getRightFoot());
       }
    }
}



