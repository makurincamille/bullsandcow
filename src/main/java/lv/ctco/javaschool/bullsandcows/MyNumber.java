package lv.ctco.javaschool.bullsandcows;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RequestScoped
public class MyNumber {

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
        int bulls = 0;
        byte[] generatedNumber = number.getNumberArray();
        byte[] guessNumber = numberArray;

        for (int i = 0; i < generatedNumber.length; i++) {
            if (generatedNumber[i] == guessNumber[i]) {
                bulls++;
            }
        }
        return bulls;
    }

    public int countCows(MyNumber number) {
        int cows = 0;
        byte[] generatedNumber = number.getNumberArray();
        byte[] guessNumber = numberArray;
        for (int i = 0; i < generatedNumber.length; i++) {
            byte currentGenerated = generatedNumber[i];
            for (int j = 0; j < guessNumber.length; j++) {
                byte currentNumber = guessNumber[j];
                if (currentNumber == currentGenerated&&i!=j){
                    cows++;
                }
            }
        }
        return cows;
    }

    public byte[] getNumberArray() {
        return numberArray;
    }

    public void setNumberArray(byte[] numberArray) {
        this.numberArray = numberArray;
    }

    @Override
    public String toString() {
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i<numberArray.length;i++) {
            strB.append(numberArray[i]);
        }
        return strB.toString();
    }
}
