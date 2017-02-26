import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import com.bbc.romangenerator.RomanGenerator;

public class RomanGeneratorTest {

    private RomanGenerator converter = new RomanGenerator();

    @Test
    public void returnsRomanNumerals() throws Exception {
        assertEquals(converter.generate(1), "I");
        assertEquals(converter.generate(2), "II");
        assertEquals(converter.generate(3), "III");
        
    }
}

