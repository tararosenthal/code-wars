import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void test1() {
        assertEquals(LongestSubstringWithoutRepeatingCharacters
                .lengthOfLongestSubstring("abcabcbb"), 3);
    }

    @Test
    public void test2() {
        assertEquals(LongestSubstringWithoutRepeatingCharacters
                .lengthOfLongestSubstring("bbbbb"), 1);
    }

    @Test
    public void test3() {
        assertEquals(LongestSubstringWithoutRepeatingCharacters
                .lengthOfLongestSubstring("pwwkew"), 3);
    }
}
