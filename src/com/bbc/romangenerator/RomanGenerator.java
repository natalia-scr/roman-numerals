package com.bbc.romangenerator;

public class RomanGenerator implements RomanNumeralGenerator {
    public String generate(int number) {
        String roman = "";

        if (number < 1) return "Number must be equal or bigger than 1";
        if (number > 3999) return "Number must be equal or smaller than 3999";

        while (number >= 1) {
            roman += "I";
            number--;
        }
        return roman;
    }
}
