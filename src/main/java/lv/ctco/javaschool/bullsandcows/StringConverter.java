package lv.ctco.javaschool.bullsandcows;

import java.util.HashMap;
import java.util.Map;

public class StringConverter {

    public static byte[] convert(String string) {
        Map<Character, Byte> charByteMap = new HashMap<>();
        charByteMap.put('0', (byte) 0);
        charByteMap.put('1', (byte) 1);
        charByteMap.put('2', (byte) 2);
        charByteMap.put('3', (byte) 3);
        charByteMap.put('4', (byte) 4);
        charByteMap.put('5', (byte) 5);
        charByteMap.put('6', (byte) 6);
        charByteMap.put('7', (byte) 7);
        charByteMap.put('8', (byte) 8);
        charByteMap.put('9', (byte) 9);

        byte[] result = new byte[4];
        for (int i = 0; i < string.length(); i++) {
            result[i] = charByteMap.get(string.charAt(i));
        }

        return result;
    }
}