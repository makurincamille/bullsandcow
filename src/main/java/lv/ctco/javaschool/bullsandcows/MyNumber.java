package lv.ctco.javaschool.bullsandcows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyNumber {

    private String number;
    private byte[] numberArray;

    public void stringToArray(){

    }
    public void thinkNumber(){
        List<Byte> nums = new ArrayList<>(10);
        for (byte i =0; i<10;i++){
            nums.add(i);
        }
        Collections.shuffle(nums);
        byte [] result = new byte[4];
        for (int i =0;i<4; i++){
            result[i] = nums.get(i);}
        this.numberArray = result;
    }


    public int countBulls(MyNumber number){
        int bulls=0;
     return bulls;
    }

    public int countCows(MyNumber number){
        int cows =0;
        return cows;
    }

}
