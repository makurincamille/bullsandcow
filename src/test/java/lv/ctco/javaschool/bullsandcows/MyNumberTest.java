package lv.ctco.javaschool.bullsandcows;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kamil.makurin on 7/1/2016.
 */
public class MyNumberTest {
    @Test
    public void toStringTest(){
        String expected = "1234";
        byte[] numbers = new byte[]{1,2,3,4};
        MyNumber num = new MyNumber(numbers);
        assertEquals(expected,num.toString());
    }
}
