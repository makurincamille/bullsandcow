package lv.ctco.javaschool.bullsandcows;


import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Named("gameUI")
@SessionScoped
public class GameUI implements Serializable {
    @Inject
    private GameBean gameBean;
    private String playerName;
    private String guessValue;
    private String generatedNumber;
    private List<Move> moves;

    public String startGame() {
        gameBean.start();
        generatedNumber = gameBean.getGeneratedNumber();
        return "game?faces-redirect=true";
    }

    public void makeTurn() {
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

    public byte[] stringToArray(String value) {
        byte[] result = StringConverter.convert(value);

        return result;
    }

    public String getGeneratedNumber() {
        return generatedNumber;
    }
}
