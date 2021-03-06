package lv.ctco.javaschool.bullsandcows;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

public class Move  implements Serializable {

    private MyNumber number;
    private int turnNumber;
    private int bulls;
    private int cows;

    public Move() {
    }

    public Move(MyNumber number, int turnNumber, int bulls, int cows) {
        this.number = number;
        this.turnNumber = turnNumber;
        this.bulls = bulls;
        this.cows = cows;
    }

    public String getNumber() {
        String numberStr = number.toString();
        return numberStr;
    }

    public void setNumber(MyNumber number) {
        this.number = number;
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
}
