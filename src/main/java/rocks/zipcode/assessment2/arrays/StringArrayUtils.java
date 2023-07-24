package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

        if (startingIndex < 0 || startingIndex >= arrayToBeSpliced.length || endingIndex <= startingIndex ||
                endingIndex >= arrayToBeSpliced.length) {
            throw new IllegalArgumentException("Invalid startingIndex or endingIndex");
        }
        int stuff = endingIndex - startingIndex + 1;
        String[] getSpliced = new String[stuff];
        System.arraycopy(arrayToBeSpliced, startingIndex, getSpliced, 0, stuff);
        return getSpliced ;
    }








    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        int something = arrayToBeSpliced.length - startingIndex;
        if (startingIndex <0 || startingIndex >= arrayToBeSpliced.length){
            return new String[0];
        } String[] stuff = new String[something];
        for (int i = startingIndex; i < arrayToBeSpliced.length ; i++) {
            stuff[i - startingIndex] = arrayToBeSpliced[i];

        }

        return stuff;
    }
}
