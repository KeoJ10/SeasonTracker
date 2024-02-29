public interface Team {
    String getName();
    int getPlayed();
    int getWon();
    int getDrawn();
    int getLost();
    int getGoalsFor();
    int getGoalsAgainst();
    int getGoalDifference();
    int getPoints();
    void recordMatchResult(int goalsFor, int goalsAgainst);
}
