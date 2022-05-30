import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        // create hashmap to store each character and its position
        // create ints to store start of substring and length of substring
        // loop through string character by character
        // store character in a char
        // check if character is already in hashmap (repeat)
        // check if that character's position is within substring (not a unique substring)
        // if so, start checking a new substring one position after found character
        // reassign length to either current length or length of substring being checked,
        // whichever is greater
        // add current character of iteration to hashmap with position
        // return length

        Map<Character, Integer> map = new HashMap<>();
        int start = 0, len = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                if (map.get(c) >= start) {
                    start = map.get(c) + 1;
                }
            }
            len = Math.max(len, i - start + 1);
            map.put(c, i);
        }
        return len;
    }
}
