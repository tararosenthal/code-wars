import java.util.ArrayList;
import java.util.List;

class RangeExtractor {
    public static String rangeExtraction(int[] numbers) {
        ArrayList<String> collatedRanges = new ArrayList<>();
        int previousNumber = Integer.MIN_VALUE;
        boolean range = false;

        for (int number : numbers) {
            if (number - 1 == previousNumber) {
                range = true;
            } else {
                if (range) {
                    addRangeGreaterThanTwoOrNumberToList(previousNumber, collatedRanges);
                    range = false;
                }
                addNumberToList(number, collatedRanges);
            }
            previousNumber = number;
        }
        if (range) {
            addRangeGreaterThanTwoOrNumberToList(previousNumber, collatedRanges);
        }
        return String.join(",", collatedRanges);
    }

    private static void addRangeGreaterThanTwoOrNumberToList(int endNumber, List<String> collatedRanges) {
        int startNumber = Integer.parseInt(collatedRanges.get(collatedRanges.size() - 1));

        if (isRangeGreaterThanTwo(startNumber, endNumber)) {
            addRangeToList(startNumber, endNumber, collatedRanges);
        } else {
            addNumberToList(endNumber, collatedRanges);
        }
    }

    private static boolean isRangeGreaterThanTwo(int startNumber, int endNumber) {
        return startNumber != endNumber - 1;
    }

    private static void addRangeToList(int startNumber, int endNumber, List<String> collatedRanges) {
        collatedRanges.set(collatedRanges.size() - 1,
                String.format("%d-%d", startNumber, endNumber));
    }

    private static void addNumberToList(int number, List<String> collatedRanges) {
        collatedRanges.add(Integer.toString(number));
    }
}
