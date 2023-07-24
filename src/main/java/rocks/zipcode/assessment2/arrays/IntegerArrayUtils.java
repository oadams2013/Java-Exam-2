package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray   - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        int i;
        //create a new array list
        List<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(integerArray));
        arrlist.add(valueToBeAdded); // adding an element to the array list
        integerArray = arrlist.toArray(integerArray); //converting the array list to an array
        return integerArray; // should return back an array with the newly added element
    }

    /**
     * @param integerArray      - array to be manipulated
     * @param indexToInsertAt   - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        // for (int i = 0; i < integerArray.length; i++) {
        //   if (integerArray[i] == indexToInsertAt){
        //       integerArray[i] = replace( integerArray(i));
        int newArray = integerArray.length + 1 ;
        Integer[] stuff = new Integer[newArray];
        for (int i = 0; i < indexToInsertAt; i++) {
            stuff[i ] = integerArray[i] ;
        }
        stuff[indexToInsertAt] = valueToBeInserted;
        for (int i = indexToInsertAt; i < integerArray.length ; i++) {
            stuff[i +1] = integerArray[i];

        }
        return stuff;
        }




    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        if (indexToFetch < 0 || indexToFetch >= integerArray.length) { //it is checking if the position actually exists
            // if the position is out of the range it will say index out of range
            //if its within the range it will give you a number
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return integerArray[indexToFetch]; // return array at the given index
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer[] newArray = new Integer[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) { // even values incremented by 1
                newArray[i] = integerArray[i] + 1;

            } else {
                newArray[i] = integerArray[i] - 1; // odd values decremented by 1
            }

        }
        return newArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] newArray = new Integer[integerArray.length];

        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) { // even values incremented by 1
                newArray[i] = integerArray[i] + 1;

            } else {
                newArray[i] = integerArray[i];
            }
        }
        return newArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] newArray = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 1) {
                newArray[i] = input[i] - 1;
            } else {
                newArray[i] = input[i];
            }

        }return newArray;
    }
}
