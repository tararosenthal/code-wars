import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumerals {
    private static Map<String, Integer> romanToNumericMap = new LinkedHashMap<>();

    static {
        romanToNumericMap.put("M", 1000);
        romanToNumericMap.put("CM", 900);
        romanToNumericMap.put("D", 500);
        romanToNumericMap.put("CD", 400);
        romanToNumericMap.put("C", 100);
        romanToNumericMap.put("XC", 90);
        romanToNumericMap.put("L", 50);
        romanToNumericMap.put("XL", 40);
        romanToNumericMap.put("X", 10);
        romanToNumericMap.put("IX", 9);
        romanToNumericMap.put("V", 5);
        romanToNumericMap.put("IV", 4);
        romanToNumericMap.put("I", 1);
    }

    public static String toRoman(int n) {
        StringBuilder roman = new StringBuilder();

        for (Map.Entry<String, Integer> entry: romanToNumericMap.entrySet()) {
            while (n >= entry.getValue()) {
                roman.append(entry.getKey());
                n -= entry.getValue();
            }
        }
        return roman.toString();
    }

    public static int fromRoman(String romanNumeral) {
        Pattern pattern = Pattern.compile("(CM)|(CD)|(XC)|(XL)|(IX)|(IV)|([MDCLXVI])");
        Matcher matcher = pattern.matcher(romanNumeral);
        int numeric = 0;

        while (matcher.find()) {
            numeric += romanToNumericMap.get(matcher.group());
        }

        return numeric;
    }
}
