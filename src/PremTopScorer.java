public class PremTopScorer implements TopScorer{
   public String name;
    public int goalsScored;

    public int left;
    public int right;

    public PremTopScorer(String name, int left, int right){
        this.name = name;
        this.left = left;
        this.right = right;
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

    @Override
    public int getLeftFoot() {
        return left;
    }

    @Override
    public int getRightFoot() {
        return right;
    }
}
