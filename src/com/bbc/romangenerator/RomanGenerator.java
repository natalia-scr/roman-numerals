package com.bbc.romangenerator;


public class RomanGenerator implements RomanNumeralGenerator{
    public String generate (int number) {
        String roman = "";

        while(number >= 1) {
            roman +="I";
            number--;
        }
        return roman;
    }
}
