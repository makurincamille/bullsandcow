package lv.ctco.javaschool.bullsandcows;

import lv.ctco.javaschool.bullsandcows.BullsAndCowsExceptions.BullasAndCowsDebugException;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
public class GameBean implements Serializable {

    private String playerName;
    private MyNumber generatedNumber = null;
    private List<Move> moves = new ArrayList<>();

    public void start() {
        generatedNumber = new MyNumber();
        generatedNumber.thinkNumber();
        moves.removeAll(moves);
    }

    public boolean makeTurn(byte[] guessValue) {
        boolean got4Bulls = false;
        MyNumber guess = new MyNumber(guessValue);
        int bulls = guess.countBulls(generatedNumber);
        int cows = guess.countCows(generatedNumber);
        moves.add(new Move(guess, moves.size() + 1, bulls, cows));
        if (bulls==4){
            got4Bulls = true;
        }

        return got4Bulls;
    }

    public String getGeneratedNumber() {
        String generatedNumberStr = generatedNumber.toString();
        return generatedNumberStr;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


}
