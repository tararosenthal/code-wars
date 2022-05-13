import java.util.ArrayList;
import java.util.List;

public class JustifyString {
    public static String justify(String text, int width) {
        String[] words = text.split(" ");
        String line = "";
        List<String> lines = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (line.length() + words[i].length() + 1 > width || i == words.length - 1) {
                if (line.length() < width && line.length() + words[i].length() + 1 > width) {
                    line = addSpaces(line, width);
                }
                // Add to arraylist, account for possible final line
                if (line.length() + words[i].length() + 1 > width) {
                    lines.add(line);
                    line = words[i];
                    if (i == words.length - 1) {
                        lines.add(line);
                    }
                } else {
                    if (line.equals("")) {
                        lines.add(words[i]);
                    } else {
                        line += " " + words[i];
                        lines.add(line);
                    }
                }
            } else {
                line = String.format("%s %s", line, words[i]).trim();
            }
        }
        return String.join("\n", lines);
    }

    private static String addSpaces(String line, int width) {
        String[] lineArray = line.split(" ");
        int[] spaces = createSpacesArray(width, line.length(), lineArray.length);
        StringBuilder lineBuilder = new StringBuilder();
        for (int i = 0; i < lineArray.length; i++) {
            lineBuilder.append(lineArray[i]);
            lineBuilder.append(" ".repeat(Math.max(0, spaces[i])));
        }
        line = lineBuilder.toString();
        return line;
    }

    private static int[] createSpacesArray(int width, int numOfChars, int numOfWords) {
        int difference = width - numOfChars + (numOfWords - 1);
        int divisor = (int) Math.ceil(difference / (double) (numOfWords - 1));
        int[] spacesArray = new int[numOfWords];
        for (int i = 0; i < numOfWords - 1; i++) {
            spacesArray[i] = divisor;
        }

        int addedSpaces = divisor * (numOfWords - 1);
        int iterator = numOfWords - 2;

        while (difference < addedSpaces) {
            --spacesArray[iterator];
            --iterator;
            --addedSpaces;
        }
        spacesArray[numOfWords - 1] = 0;
        return spacesArray;
    }

}
