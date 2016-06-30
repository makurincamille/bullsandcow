package lv.ctco.javaschool.boolsandcows;

import lv.ctco.javaschool.bullsandcows.Game;
import lv.ctco.javaschool.bullsandcows.Guess;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Camille on 30.06.2016.
 */
public class GameTest {

    @Test
public void GameTest(){
        Game game = new Game();

        byte[] guessValue =new byte[]{1,2,3,4};
        List<Guess> guesses = new ArrayList<>();
        Guess guess = new Guess();
        guess.setBulls(2);
        guess.setCows(30);
        guess.setGuess(guessValue);
        guess.setTurnNumber(4);
        guesses.add(guess);
        System.out.print(guess.getGuess());
    }
}
