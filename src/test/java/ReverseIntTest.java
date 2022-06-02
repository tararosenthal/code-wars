import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntTest {
    @Test
    public void test1() {
        assertEquals(321, ReverseInt.reverse(123));
    }

    @Test
    public void test2() {
        assertEquals(-321, ReverseInt.reverse(-123));
    }

    @Test
    public void test3() {
        assertEquals(21, ReverseInt.reverse(120));
    }
}
