import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToIntegerTest {
    @Test
    public void test1() {
        assertEquals(42, StringToInteger.myAtoi("42"));
    }

    @Test
    public void test2() {
        assertEquals(-42, StringToInteger.myAtoi("   -42"));
    }

    @Test
    public void test3() {
        assertEquals(4193, StringToInteger.myAtoi("4193 with words"));
    }
}
