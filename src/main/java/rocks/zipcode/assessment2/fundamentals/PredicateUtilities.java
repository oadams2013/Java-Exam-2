package rocks.zipcode.assessment2.fundamentals;

public class PredicateUtilities {
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */
    public static Boolean isEven(Integer value) {

        return value % 2 == 0;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */
    public static Boolean isOdd(Integer value) {

        return value % 2 !=0;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public static Boolean isMultipleOf3(Integer value) {
        while (value > 9) {
            int sum = 0;
            while (value > 0) {
                sum += value % 10;
                value /= 10;
            }
            value = sum;
        }
        if (value % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param value - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public static Boolean isMultipleOfN(Integer value, Integer multiple) {
        return value % multiple == 0;
    }




    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     */
    public static Boolean startsWithCapitalLetter(String string) {
        if (string == null || string.isEmpty()){
            return false;
        } char firstLetter = string.charAt(0);

        return Character.isUpperCase(firstLetter);
    }
}
