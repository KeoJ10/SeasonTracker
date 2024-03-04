public class PremTopScorer implements TopScorer{
    String name;
    int goalsScored;


    public PremTopScorer(String name){
        this.name = name;
    }

    public void goalsScoredAdd(){
        goalsScored++;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getGoalsScored() {
        return goalsScored;
    }
}
