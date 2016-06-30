package lv.ctco.javaschool.bullsandcows;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by kamil.makurin on 6/30/2016.
 *
 * qwe
 */
@ApplicationScoped
public class RandomThinker implements Serializable {
    public byte [] thinkNumber(){
        List<Byte> nums = new ArrayList<>(10);
        for (byte i =0; i<10;i++){
            nums.add(i);
        }
        Collections.shuffle(nums);
        byte [] result = new byte[4];
        for (int i =0;i<4; i++){
            result [i] = nums.get(i);}
        return result;
    }
}
