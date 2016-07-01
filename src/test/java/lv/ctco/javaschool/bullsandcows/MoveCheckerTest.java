package lv.ctco.javaschool.bullsandcows;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kamil.makurin on 7/1/2016.
 */
public class MoveCheckerTest {
    GuessChecker guessChecker = new GuessChecker();

    @Test
    public void test4Bulls() {
        byte[] guessValue = new byte[]{1, 2, 3, 4};
        byte[] number = new byte[]{1, 2, 3, 4};
        guessChecker.checkGuess(guessValue, number);

        assertEquals(4, guessChecker.getBulls());
        assertEquals(0, guessChecker.getCows());

    }

    @Test
    public void test2Bulls2Cows() {
        byte[] guessValue = new byte[]{1, 2, 4, 3};
        byte[] number = new byte[]{1, 2, 3, 4};
        guessChecker.checkGuess(guessValue, number);

        assertEquals(2, guessChecker.getBulls());
        assertEquals(2, guessChecker.getCows());

    }

    @Test
    public void test2Cows() {
        byte[] guessValue = new byte[]{4, 3, 7, 8};
        byte[] number = new byte[]{1, 2, 3, 4};
        guessChecker.checkGuess(guessValue, number);
        assertEquals(2, guessChecker.getCows());
        assertEquals(0, guessChecker.getBulls());

    }

    @Test
    public void testNoCowsNoBuls() {
        byte[] guessValue = new byte[]{5, 6, 7, 8};
        byte[] number = new byte[]{1, 2, 3, 4};
        guessChecker.checkGuess(guessValue, number);

        assertEquals(0, guessChecker.getBulls());
        assertEquals(0, guessChecker.getBulls());

    }

    @Test
    public void test2SameBulls() {
        byte[] guessValue = new byte[]{2, 2, 4, 3};
        byte[] number = new byte[]{1, 2, 3, 4};
        guessChecker.checkGuess(guessValue, number);

        assertEquals(1, guessChecker.getBulls());
        //assertEquals(2, guessChecker.getCows());
    }
}