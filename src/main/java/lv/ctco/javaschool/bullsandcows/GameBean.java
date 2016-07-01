package lv.ctco.javaschool.bullsandcows;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Named("game")
@SessionScoped
public class GameBean implements Serializable {

    private String playerName;
    private MyNumber generatedNumber;
    private List<Move> moves = new ArrayList<>();

    public String start() {
        generatedNumber = new MyNumber();
        generatedNumber.thinkNumber();
        moves.removeAll(moves);
        return "game?faces-redirect=true";
    }

    public void makeTurn(byte[] guessValue){
        MyNumber guess = new MyNumber(guessValue);
    moves.add(new Move(guess,moves.size()+1,guess.countBulls(generatedNumber),guess.countCows(generatedNumber)));
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
