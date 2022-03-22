public class BraceChecker {
    public boolean isValid(String braces) {
        // check if each open brace has a closing brace of same type
        // check if even number of chars between braces of same type
        // replace checked braces with another character

        char[] bracesArray = braces.toCharArray();
        char closingBrace = '1'; //placeholder character

        for (int i = 0; i < bracesArray.length; i++) {
            switch(bracesArray[i]) {
                case '(' :
                    closingBrace = ')';
                    break;
                case '{' :
                    closingBrace = '}';
                    break;
                case '[' :
                    closingBrace = ']';
                    break;
                case '1' :
                    closingBrace = '1';
                    break;
                default  :
                    return false;
            }

            if (closingBrace != '1' && !hasClosingBrace(closingBrace, bracesArray, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasClosingBrace(char brace, char[] bracesArray, int openBraceLocation) {
        for (int i = openBraceLocation; i < bracesArray.length; i++) {
            if (brace == bracesArray[i] && (openBraceLocation + i) % 2 == 1) {
                bracesArray[i] = '1';
                return true;
            }
        }
        return false;
    }
}
