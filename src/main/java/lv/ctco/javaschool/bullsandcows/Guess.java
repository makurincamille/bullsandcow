package lv.ctco.javaschool.bullsandcows;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Created by kamil.makurin on 6/30/2016.
 */

public class Guess {

    private byte[] guess;
    private int turnNumber;
    private int bulls;
    private  int cows;
    private String guessString;

    public String getGuessString() {
        return guessString;
    }

    public void setGuessString(byte[] guess) {
        this.guessString = guess.toString();
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

    public byte[] getGuess() {
        return guess;
    }

    public void setGuess(byte[] guess) {
        this.guess = guess;
    }
}
