public class BowlingGame {
    // TODO: Why must this array have a size of 21? answer: There should be 21 rolls if the sum of rolls 19 and 20 are greater or equal to 10.
    int[] rolls = new int[21];
    private int index;

    public void roll(int pins) {
        // TODO: Replace this with description of why this postfix operator works here ; answer: Value for the next roll in the array is equal to the current plus one.
        rolls[index++] = pins;
    }

    public int score() {
        int score = 0;
        //for (int currentScore: score)

        // TODO CODE: Change this to use a loop prior to implementing spare and strike calculation and then commit to git
        //            This change should not break the existing tests that pass. This is called refactoring.

        // TODO RESPONSE: Why does the subscript need to start with zero? answer: Index range for rolls is 0 to number of elements (rolls) minus 1.

        int startOfFrameIndex = 0;
        for (int frame = 1; frame < 11; frame++) {
            score += rolls[startOfFrameIndex] + rolls[++startOfFrameIndex];

        }
//            score += rolls[0] + rolls[1];
//            score += rolls[2] + rolls[3];
//            score += rolls[4] + rolls[5];
//            score += rolls[6] + rolls[7];
//            score += rolls[8] + rolls[9];
//            score += rolls[10] + rolls[11];
//            score += rolls[12] + rolls[13];
//            score += rolls[14] + rolls[15];
//            score += rolls[16] + rolls[17];
//            score += rolls[18] + rolls[19];

        return score;

    }


}
