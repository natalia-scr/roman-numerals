package com.bbc.romangenerator;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanGenerator implements RomanNumeralGenerator {

    private LinkedHashMap <Integer, String> numberPairs = new LinkedHashMap <Integer, String>();

    public RomanGenerator() {
        numberPairs.put(1000, "M");
        numberPairs.put(900, "CM");
        numberPairs.put(500, "D");
        numberPairs.put(400, "CD");
        numberPairs.put(100, "C");
        numberPairs.put(90, "XC");
        numberPairs.put(50, "L");
        numberPairs.put(40, "XL");
        numberPairs.put(10, "X");
        numberPairs.put(9, "IX");
        numberPairs.put(5, "V");
        numberPairs.put(4, "IV");
        numberPairs.put(1, "I");
    }



    public String generate (int number) {
        if (number < 1) return "Number must be equal or bigger than 1";
        if (number > 3999) return "Number must be equal or smaller than 3999";

        String roman = "";

        for(Map.Entry<Integer, String> entry : numberPairs.entrySet()) {
            Integer arabic = entry.getKey();
            String romanNumeral = entry.getValue();

            while(number >= arabic) {
                roman += romanNumeral;
                number -= arabic;
            }
        }
        return roman;

    }
}
