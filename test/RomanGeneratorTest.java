import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import com.bbc.romangenerator.RomanGenerator;

public class RomanGeneratorTest {

    private RomanGenerator converter = new RomanGenerator();

    // test roman generator for regular roman numerals
    @Test
    public void returnsRomanNumeralsFromOneToThree() throws Exception {
        assertEquals(converter.generate(1), "I");
        assertEquals(converter.generate(2), "II");
        assertEquals(converter.generate(3), "III");
    }

    // test caveat exceptions
    @Test
    public void returnsCaveatMessageIfNumberIsOutOfRange() throws Exception {
        assertEquals(converter.generate(-5), "Number must be equal or bigger than 1");
        assertEquals(converter.generate(0), "Number must be equal or bigger than 1");
        assertEquals(converter.generate(4000), "Number must be equal or smaller than 3999");
        assertEquals(converter.generate(5087), "Number must be equal or smaller than 3999");
    }

    // test roman generator for irregular roman numerals

    @Test
    public void returnsCorrectIrregularRomanNumerals() throws Exception {
        assertEquals(converter.generate(4), "IV");
        assertEquals(converter.generate(5), "V");
        assertEquals(converter.generate(9), "IX");
    }

    // test generator to return correct numerals for numbers that are bigger than 40
    @Test
    public void returnsCorrectNumeralsForNumbersBiggerThan40() throws Exception{
        assertEquals(converter.generate(40), "XL");
        assertEquals(converter.generate(49), "XLIX");
        assertEquals(converter.generate(50), "L");
        assertEquals(converter.generate(55), "LV");
    }

    // test generator to return correct numerals for numbers that are bigger than 90

    @Test
    public void returnsCorrectNumeralsForNumbersBiggerThan90() throws Exception {
        assertEquals(converter.generate(90), "XC");
        assertEquals(converter.generate(100), "C");
        assertEquals(converter.generate(400), "CD");
        assertEquals(converter.generate(500), "D");
        assertEquals(converter.generate(900), "CM");
        assertEquals(converter.generate(1000), "M");
    }

    // test that generator returns the correct numerals for large numbers
    @Test
    public void returnsCorrectNumeralsForNumbersBiggerThan1000() throws Exception {
        assertEquals(converter.generate(1099), "MXCIX");
        assertEquals(converter.generate(2356), "MMCCCLVI");
        assertEquals(converter.generate(3789), "MMMDCCLXXXIX");
        assertEquals(converter.generate(3999), "MMMCMXCIX");
    }

}