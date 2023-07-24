package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
       StringBuilder thing = new StringBuilder();
        for (int i = 0; i < amountOfPadding ; i++) {
            thing.append(' ');
        }

        return thing.substring(stringToBePadded.length()) + stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {


        return String.format("%1$-" + amountOfPadding + "s" , stringToBePadded) ;



    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        if (stringToBeRepeated == null || stringToBeRepeated == "")
            return stringToBeRepeated;
        String thing = "";
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            thing = thing + stringToBeRepeated;
        }

        return thing;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        if (string == null || string.isEmpty()){
            return false;
        }
        for (char c : string.toCharArray()) {
        if (!Character.isLetter(c)){
            return false;
        }
        }

        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        String regex = "^[0-9]+$";

        return string.matches(regex);
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String regex = "^[^a-zA-Z0-9]+$";
        return string.matches(regex);
    }
}
