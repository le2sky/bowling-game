public class Game {

  private int[] rolls = new int[21];
  private int currentRoll = 0;

  public void roll(int pins) {
    rolls[currentRoll++] = pins;
  }

  public int getScore() {
    int score = 0;
    int firstRollInFrame = 0;
    for (int frame = 0; frame < 10; frame++) {
      if (rolls[firstRollInFrame] + rolls[firstRollInFrame + 1] == 10) {
        score += 10 + rolls[firstRollInFrame + 2];
        firstRollInFrame += 2;
      } else {
        score += rolls[firstRollInFrame] + rolls[firstRollInFrame + 1];
        firstRollInFrame += 2;
      }
    }

    return score;
  }
}
