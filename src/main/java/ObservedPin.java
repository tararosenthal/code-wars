import java.util.*;

public class ObservedPin {
    private final static Character[][] NUMPAD ={{'1', '2', '3'},
                                                {'4', '5', '6'},
                                                {'7', '8', '9'},
                                                {'_', '0', '_'}};

    public static List<String> getPINs(String observed) {
        Set<String> possiblePins = new HashSet<>();
        List<List<Character>> allPossibleButtons = new ArrayList<>();

        for (int i = 0; i < observed.length(); i++) {
            allPossibleButtons.add(parseNumpad(observed.charAt(i)));
        }

        generatePermutations(allPossibleButtons, possiblePins, 0, "");
        return new ArrayList<>(possiblePins);
    }

    private static List<Character> parseNumpad(Character button) {
        final String[] DIRECTIONS = {"left", "right", "up", "down"};
        int row = 0;
        int column = 0;
        List<Character> possibleButtons = new ArrayList<>();
        possibleButtons.add(button);

        for(int i = 0; i < NUMPAD.length; i++) {
            for (int j = 0; j < NUMPAD[i].length; j++) {
                if (NUMPAD[i][j].equals(button)) {
                    row = i;
                    column = j;
                    break;
                }
            }
        }
        for (String direction : DIRECTIONS) {
            Character possibleButton;

            switch(direction) {
                case "left" :
                    possibleButton = getSafeButton(row, column, 0, -1);
                    break;
                case "right" :
                    possibleButton = getSafeButton(row, column, 0, 1);
                    break;
                case "up" :
                    possibleButton = getSafeButton(row, column, -1, 0);
                    break;
                case "down" :
                    possibleButton = getSafeButton(row, column, 1, 0);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + direction);
            }
            if (possibleButton != '_') {
                possibleButtons.add(possibleButton);
            }
        }
        return possibleButtons;
    }

    private static Character getSafeButton(int row, int column, int offsetRow, int offsetColumn) {
        if (row + offsetRow > 3 || row + offsetRow < 0
                || column + offsetColumn > 2 || column + offsetColumn < 0) {
            return '_';
        } else {
            return NUMPAD[row + offsetRow][column + offsetColumn];
        }
    }

    private static void generatePermutations(List<List<Character>> lists, Set<String> result,
                                             int depth, String current) {
        if (depth == lists.size()) {
            result.add(current);
            return;
        }

        for (int i = 0; i < lists.get(depth).size(); i++) {
            generatePermutations(lists, result, depth + 1, current + lists.get(depth).get(i));
        }
    }
}
