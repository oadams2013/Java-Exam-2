package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        char c;
        String s = "";
        for (int i = 0; i < string1.length(); i++) {
            c = string1.charAt(i);
            s = c + s;

        }
        return s;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        char c;
        String s = "";
        for (int i = 0; i < string1.length(); i++) {
            c= string1.charAt(i);
            s = c + s;

        } char o;
        String t = "";
        for (int i = 0; i < string2.length() ; i++) {
            o = string2.charAt(i);
            t = o + t;

        }
        return s + t;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
    StringBuilder stuff = new StringBuilder();
        for (char c : string.toCharArray()) {
            if(charactersToRemove.indexOf(c) == -1){
                stuff.append(c);
            }

        }
        return stuff.toString();
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        StringBuilder stuff = new StringBuilder();
        for (char c : string.toCharArray()) {
            if(charactersToRemove.indexOf(c) == -1){
                stuff.append(c);
            }

        }
        return stuff.toString();

    } char m;
    return null;
}
