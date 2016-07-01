package lv.ctco.javaschool.bullsandcows;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Created by kamil.makurin on 6/30/2016.
 */

public class Guess {

    private byte[] guessArray;
    private int turnNumber;
    private int bulls = 3;
    private int cows = 2;
    private String guessString;

    public String getGuessString() {
        return guessString;
    }

    public void setGuessString(String guess) {
        this.guessString = guess;
    }

    public int getTurnNumber() {
        return turnNumber;
    }

    public void setTurnNumber(int turnNumber) {
        this.turnNumber = turnNumber;
    }

    public int getBulls() {
        return bulls;
    }

    public void setBulls(int bulls) {
        this.bulls = bulls;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public byte[] getGuessArray() {
        return guessArray;
    }

    public void setGuessArray(String guessString) {
        byte[] result = new byte[4];
        for (int i = 0; i < guessString.length(); i++) {
            result[i] = (byte) guessString.charAt(i);
        }
        this.guessArray = result;
    }
}
