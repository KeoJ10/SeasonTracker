public interface FootbalLeague {
    int getPlayed();
    int getWon();
    int getDrawn();
    int getLost();
    int getGoalsFor();
    int getGoalsAgainst();
    int getGoalDifference();
    int getPoints();



    void updateRankings(int rankings);
}
