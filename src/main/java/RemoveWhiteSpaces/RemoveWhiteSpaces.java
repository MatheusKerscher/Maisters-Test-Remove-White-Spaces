package RemoveWhiteSpaces;

import java.nio.charset.StandardCharsets;

public class RemoveWhiteSpaces {
    public static String removeWhiteSpaces(String str) {
        // Use a StringBuilder to construct the new string without spaces
        StringBuilder noSpaces = new StringBuilder();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Append only non-space characters to the StringBuilder
            if (!Character.isWhitespace(currentChar)) {
                noSpaces.append(currentChar);
            }
        }

        // Convert the StringBuilder to a String and return it
        return noSpaces.toString();
    }
}
