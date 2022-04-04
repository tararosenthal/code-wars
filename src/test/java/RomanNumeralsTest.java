import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

    @Test
    public void testToRoman() throws Exception {
        assertEquals("I", RomanNumerals.toRoman(1));
        assertEquals("II", RomanNumerals.toRoman(2));
        assertEquals("IV", RomanNumerals.toRoman(4));
        assertEquals("MCMXC", RomanNumerals.toRoman(1990));
    }

    @Test
    public void testFromRoman() throws Exception {
        assertEquals(1, RomanNumerals.fromRoman("I"));
        assertEquals(2, RomanNumerals.fromRoman("II"));
        assertEquals(4, RomanNumerals.fromRoman("IV"));
        assertEquals(1990, RomanNumerals.fromRoman("MCMXC"));
    }
}