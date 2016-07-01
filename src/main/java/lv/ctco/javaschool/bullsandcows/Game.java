package lv.ctco.javaschool.bullsandcows;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;

@Named("game")
@SessionScoped
public class Game implements Serializable {

    private String playerName;
    private MyNumber generatedNumber;
    private String guessValue;
    private List<Guess> guesses = new ArrayList<>();

    public String start() {
        generatedNumber = new MyNumber();
        generatedNumber.thinkNumber();
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

    public void turn(){
        Guess guess = new Guess();
        guess.setGuessString(guessValue);
        guess.setGuessArray(guessValue);
        guess.setTurnNumber(guesses.size()+1);

        guessChecker.checkGuess(guess.getGuessArray(), number);
        guess.setBulls(guessChecker.getBulls());
        guess.setCows(guessChecker.getCows());
        guesses.add(guess);
    }

    public String getGuessValue() {
        return guessValue;
    }

    public void setGuessValue(String guess) {
        this.guessValue = guess;
    }

    public List<Guess> getGuesses() {
        return guesses;
    }

    public void setGuesses(List<Guess> guesses) {
        this.guesses = guesses;
    }
}
