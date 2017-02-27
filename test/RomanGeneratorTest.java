import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import com.bbc.romangenerator.RomanGenerator;

public class RomanGeneratorTest {

    private RomanGenerator converter = new RomanGenerator();

    @Test
    public void returnsRomanNumeralsFromOneToThree() throws Exception {
        assertEquals(converter.generate(1), "I");
        assertEquals(converter.generate(2), "II");
        assertEquals(converter.generate(3), "III");
    }

    @Test
    public void returnsCaveatMessageIfNumberIsOutOfRange() throws Exception {
        assertEquals(converter.generate(-5), "Number must be equal or bigger than 1");
        assertEquals(converter.generate(0), "Number must be equal or bigger than 1");
        assertEquals(converter.generate(4000), "Number must be equal or smaller than 3999");
        assertEquals(converter.generate(5087), "Number must be equal or smaller than 3999");
    }

}

