package lv.ctco.javaschool.bullsandcows;


import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named("gameUI")
@RequestScoped
public class GameUI implements Serializable
{
    @Inject
    private GameBean gameBean;
    private String playerName;
    private String guessValue;
    private List<Move> moves;

    public void startGame(){

        gameBean.start();

    }
    public void makeTurn(){
        gameBean.makeTurn(stringToArray(guessValue));
    }

    public List<Move> getMoves() {
        moves = gameBean.getMoves();
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

    public String getGuessValue() {
        return guessValue;
    }

    public void setGuessValue(String guesValue) {
        this.guessValue = guesValue;
    }

    public byte[] stringToArray(String value){
        byte[] result = new byte[4];
        for (int i = 0; i<value.length(); i++){
            result [i] =  (byte)value.charAt(i);
        }
        return result;
    }
}
