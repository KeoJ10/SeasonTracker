
public class Main {
    private String name;
    private int played;
    private int won;
    private int drawn;
    private int lost;
    private int goalsFor;
    private int goalsAgainst;
    private int points;
           Main(String name) {
            this.name = name;
            this.played = 0;
               this.won = 0;
               this.drawn = 0;
               this.lost = 0;
               this.goalsFor = 0;
               this.goalsAgainst = 0;
               this.points = 0;
        }
        public String getName(){
               return name;
        }
        public int getPlayed(){
               return played;
        }
        public void playedMatch(){
                played++;
        }
     public int won(){
               return won;
     }
     public void setWon(){
               won++;
     }

    }
