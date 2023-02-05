public class StringUtils {

    public static String getWordInCapitalLetters(String word) {
        if (word != null) {
            return word.toUpperCase();
        }
        return null;
    }

    public static Double convertToDouble(String numberInText) {
        if (numberInText == null) {
            return null;
        }
        return Double.valueOf(numberInText);
    }

    public static boolean isNullBlankOrEmpty(String myText) {
        return myText == null || myText.trim().length() == 0;
    }

    public static String getDefaultIfNull(String myText, String defaultText) {
        return myText == null ? defaultText : myText;
    }

    public static String concat(String[] strings) {
        String returnedConcatenatedString = null;
        if (strings != null && strings.length > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < strings.length; i++) {
                String myStringFromArray = strings[i];
                if (myStringFromArray != null) {
                    stringBuilder.append(myStringFromArray);
                }
            }
            returnedConcatenatedString = stringBuilder.toString();
        }
        return returnedConcatenatedString;
    }
}
