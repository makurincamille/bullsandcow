package lv.ctco.javaschool.bullsandcows;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class GuessChecker implements Serializable {

    private int bulls;
    private int cows;

    public void checkGuess(byte[] guessValue, byte[] number) {
        for (int i = 0; i < guessValue.length; i++) {
            byte guessChar = guessValue[i];
            for (int j = 0; j < number.length; j++) {
                byte numberChar = number[j];
                compareChars(guessChar, numberChar, i, j);
            }
        }
    }

    public void compareChars(byte guessChar, byte numberChar, int i, int j) {
        if (guessChar == numberChar) {
            if (i == j) {
                bulls++;
            } else {
                cows++;
            }
        }
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
}

