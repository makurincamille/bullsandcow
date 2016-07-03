package lv.ctco.javaschool.bullsandcows;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kamil.makurin on 7/1/2016.
 */
public class MyNumberTest {
    MyNumber generatedNumber = new MyNumber();
    byte[] numbers = new byte[]{1, 2, 3, 4};

    @Test
    public void thinkNumberTest() {
        MyNumber num = new MyNumber();
        num.thinkNumber();
        StringBuilder strB = new StringBuilder();
        for (byte b : num.getNumberArray()) {
            strB.append(b);
        }
        System.out.println(strB);

    }

    @Test
    public void toStringTest() {
        String expected = "1234";
        byte[] numbers = new byte[]{1, 2, 3, 4};
        MyNumber num = new MyNumber(numbers);
        assertEquals(expected, num.toString());
    }

    @Test
    public void countBulls1Bull() {
        generatedNumber.setNumberArray(numbers);
        byte[] inputArray = new byte[]{1, 7, 7, 7};
        MyNumber inputNumber = new MyNumber();
        inputNumber.setNumberArray(inputArray);
        assertEquals(1,inputNumber.countBulls(generatedNumber));
    }

    @Test
    public void countBulls12Bulls() {
        generatedNumber.setNumberArray(numbers);
        byte[] inputArray = new byte[]{1, 2, 7, 7};
        MyNumber inputNumber = new MyNumber();
        inputNumber.setNumberArray(inputArray);
        assertEquals(2,inputNumber.countBulls(generatedNumber));

    }

    @Test
    public void countBulls10Bulls() {
        generatedNumber.setNumberArray(numbers);
        byte[] inputArray = new byte[]{8, 7, 7, 7};
        MyNumber inputNumber = new MyNumber();
        inputNumber.setNumberArray(inputArray);
        assertEquals(0,inputNumber.countBulls(generatedNumber));
    }

    @Test
    public void countBulls12SameBulls() {
        byte[] numbersM = new byte[]{1, 1, 3, 4};
        generatedNumber.setNumberArray(numbersM);
        byte[] inputArray = new byte[]{1, 1, 7, 7};
        MyNumber inputNumber = new MyNumber();
        inputNumber.setNumberArray(inputArray);
        assertEquals(2,inputNumber.countBulls(generatedNumber));
    }



    @Test
    public void countCows1Cows() {
        generatedNumber.setNumberArray(numbers);
        byte[] inputArray = new byte[]{7, 1, 6, 6};
        MyNumber inputNumber = new MyNumber();
        inputNumber.setNumberArray(inputArray);
        assertEquals(1,inputNumber.countCows(generatedNumber));
    }

    @Test
    public void countCows2Cows() {
        generatedNumber.setNumberArray(numbers);
        byte[] inputArray = new byte[]{4, 1, 6, 6};
        MyNumber inputNumber = new MyNumber();
        inputNumber.setNumberArray(inputArray);
        assertEquals(2,inputNumber.countCows(generatedNumber));
    }
    @Test
    public void countCows0Cows() {
        generatedNumber.setNumberArray(numbers);
        byte[] inputArray = new byte[]{8, 9, 6, 6};
        MyNumber inputNumber = new MyNumber();
        inputNumber.setNumberArray(inputArray);
        assertEquals(0,inputNumber.countCows(generatedNumber));
    }

    //not imlemented yet
    @Ignore
    @Test
    public void countCows2Same() {
        byte[] numbersM = new byte[]{1, 7, 2, 2};
        generatedNumber.setNumberArray(numbersM);
        byte[] inputArray = new byte[]{2, 2, 5, 6};
        MyNumber inputNumber = new MyNumber();
        inputNumber.setNumberArray(inputArray);
        assertEquals(2,inputNumber.countCows(generatedNumber));
    }


}
