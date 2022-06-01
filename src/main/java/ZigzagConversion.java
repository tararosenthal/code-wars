public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        // check for edge case of numRows == 1
        // initialize variables: StringBuilder for return value
        //                     : int for initial string length
        //                     : int for number of chars in one cycle
        // iterate through imaginary rows to create return value by
        // iterating through initial string, one cycle at a time
        // add one letter at a time if in a top or bottom row or final column
        // otherwise two at a time
        // return StringBuilder as a string

        if (numRows == 1) {
            return s;
        }

        StringBuilder zigzag = new StringBuilder();
        int n = s.length();
        int cycleLength = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLength) {
                zigzag.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLength - i < n) {
                    zigzag.append(s.charAt(j + cycleLength - i));
                }
            }
        }
        return zigzag.toString();
    }
}
