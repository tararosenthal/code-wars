import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeTest {
    @Test
    public void test1() {
        assertEquals("bab", LongestPalindrome.longestPalindrome("babd"));
    }

    @Test
    public void test2() {
        assertEquals("bb", LongestPalindrome.longestPalindrome("cbbd"));
    }

    @Test
    public void test3() {
        assertEquals("", LongestPalindrome.longestPalindrome(""));
    }

    @Test
    public void test4() {
        assertEquals("b", LongestPalindrome.longestPalindrome("ab"));
    }
}
