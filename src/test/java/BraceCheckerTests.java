import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BraceCheckerTests {
    private final BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertTrue(checker.isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertFalse(checker.isValid("[(])"));
    }
}
