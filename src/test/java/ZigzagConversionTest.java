import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigzagConversionTest {
    @Test
    public void test1() {
        assertEquals("PAHNAPLSIIGYIR",
                ZigzagConversion.convert("PAYPALISHIRING", 3));
    }

    @Test
    public void test2() {
        assertEquals("PINALSIGYAHRPI",
                ZigzagConversion.convert("PAYPALISHIRING", 4));
    }

    @Test
    public void test3() {
        assertEquals("A", ZigzagConversion.convert("A", 1));
    }
}
