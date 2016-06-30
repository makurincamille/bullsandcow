package lv.ctco.javaschool.bullsandcows;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kamil.makurin on 6/30/2016.
 *
 */
@Named("game")
@SessionScoped
public class Game implements Serializable {
    @Inject
    private RandomThinker thinker;
    @Inject
    private GuessChecker guessChecker;

    private String playerName;
    private byte[] number;
    private byte[] guessValue;
    private List<Guess> guesses = new ArrayList<>();

    public String start() {
        number = thinker.thinkNumber();
        return "game?faces-redirect=true";
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getNumber() {
        StringBuilder result = new StringBuilder(4);
        for (byte n : number) {
            result.append(n);
        }
        return result.toString();
    }

    public void turn() {

        Guess guess = new Guess();
        guess.setGuess(guessValue);
        guess.setTurnNumber(guesses.size());
        guessChecker.checkGuess(guessValue, number);
        guess.setBulls(guessChecker.getBulls());
        guess.setCows(guessChecker.getCows());
        guesses.add(guess);
    }

    public byte[] getGuessValue() {
        return guessValue;
    }

    public void setGuessValue(byte[] guess) {
        this.guessValue = guess;
    }

    public List<Guess> getGuesses() {
        return guesses;
    }

    public void setGuesses(List<Guess> guesses) {
        this.guesses = guesses;
    }


    /*public String guessesToString(List<Guess> guesses) {
        StringBuilder strB = new StringBuilder();
        for (Guess g : guesses) {
            strB.append(g.getGuess());
        }
        return strB.toString();
    }*/
}


/*
<f:validateRegex pattern "[0-9]{4}"   vnutri tega inputText
 */