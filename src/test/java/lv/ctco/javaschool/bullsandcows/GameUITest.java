package lv.ctco.javaschool.bullsandcows;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Camille on 03.07.2016.
 */
public class GameUITest {
    GameUI gameUI = new GameUI();
    @Test
    public void stringToArrayTest(){
        String input = "1234";
        byte[] expected = new byte[]{1,2,3,4};
        byte[] actual = gameUI.stringToArray(input);
        assertEquals(expected[0],actual[0]);
        assertEquals(expected[1],actual[1]);
        assertEquals(expected[2],actual[2]);
        assertEquals(expected[3],actual[3]);

    }
}
