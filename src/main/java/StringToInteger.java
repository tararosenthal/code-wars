public class StringToInteger {
    public static int myAtoi(String s) {
        String f = s.trim();
        boolean pos = true;
        int res = 0;

        if (f.length() == 0) {
            return res;
        }

        if (f.charAt(0) == '-' || f.charAt(0) == '+') {
            if (f.charAt(0) == '-') {
                pos = false;
            }
            f = f.substring(1);
        }
        // loop through chars of f, check if each is a digit
        // if not return current result
        // if so, check if current result X 10 > max int or less than min int
        // check if current result times 10 equal to max int and digit > 7 or < -8
        // if not add to end of current result:
        // multiply current result by 10 and add current digit
        // at the end multiply by -1 if negative

        for (int i = 0; i < f.length(); i++) {
            char c = f.charAt(i);

            if (Character.isDigit(c)) {
                int x = Character.getNumericValue(c);
                if (res > Integer.MAX_VALUE / 10 ||
                        (res == Integer.MAX_VALUE / 10 && x > Integer.MAX_VALUE % 10)) {
                    return pos ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                res = res * 10 + x;
                continue;
            }
            break;
        }
        return pos ? res : res * -1;
    }
}
