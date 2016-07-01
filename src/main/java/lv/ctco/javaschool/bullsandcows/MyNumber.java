package lv.ctco.javaschool.bullsandcows;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyNumber {

    @Inject
    private GuessChecker guessChecker;
    private byte[] numberArray;

    //Default Constructor
    public MyNumber() {
    }
    //custom Constructor
    public MyNumber(byte[] numberArray) {
        this.numberArray = numberArray;
    }

    //random number generator
    public void thinkNumber() {
        List<Byte> nums = new ArrayList<>(10);
        for (byte i = 0; i < 10; i++) {
            nums.add(i);
        }
        Collections.shuffle(nums);
        byte[] result = new byte[4];
        for (int i = 0; i < 4; i++) {
            result[i] = nums.get(i);
        }
        this.numberArray = result;
    }


    public int countBulls(MyNumber number) {
        guessChecker.checkGuess(numberArray, number.getNumberArray());
        int bulls = guessChecker.getBulls();
        return bulls;
    }

    public int countCows(MyNumber number) {
        guessChecker.checkGuess(numberArray, number.getNumberArray());
        int cows = guessChecker.getCows();
        return cows;
    }

    public void toMyNumberString() {

    }

    public byte[] getNumberArray() {
        return numberArray;
    }

    public void setNumberArray(byte[] numberArray) {
        this.numberArray = numberArray;
    }
}
