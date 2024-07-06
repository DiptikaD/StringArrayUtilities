package com.zipcodewilmington;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
      //return StringArrayUtils.contains(array, value);
      return  Arrays.asList(array).contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        for (int i = 0; i < array.length/2; i++){
            String[] temp = new String[]{array[i]};
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp[0];
        } return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int falseCounter = 0;
        for (int i = 0; i < array.length/2; i++){
        String[] temp = new String[]{array[i]};

        if (!temp[0].equals(array[array.length-i-1])){
           falseCounter++;
        }
    }
        if (falseCounter > 0){
            return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
//      char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//      int alphabetCounter = 0;
//      int tempIndexDecrementer = 0;
//
//
//      //as alphabet[i], look through array[i]; add to counter when is equal;
//        //temp string of index i of array
//        //search through string for char matching alphabet
//      for (int i = 0; i < array.length; i++){
//          for (int j = 0; j < alphabet.length; j++){
//              String temp = array[i];
//              int tempIndex = array[i].length()-1 -tempIndexDecrementer;
//    //          char tempChar = temp.charAt(tempIndex);
//              if (temp.charAt(tempIndex) == alphabet[j]){
//                  tempIndexDecrementer++;
//                  alphabetCounter++;
//              }
//              tempIndexDecrementer++;
//          }
//      } tempIndexDecrementer = 0;
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
    int occuranceCounter = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i].contains(value)){
                occuranceCounter++;
            }
        }
        return occuranceCounter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> newArrList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                newArrList.add(array[i]);}
        }
        String[] list = new String[0];
       return newArrList.toArray(list);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList<String> arrList = new ArrayList<String>();
        for (int i = 0; i < array.length; i++){
            if (!arrList.contains(array[i])){
                arrList.add(array[i]);
            }
        }
        String[] list = new String[0];
        return arrList.toArray(list);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
//        ArrayList<String> arrList = new ArrayList<String>();
//        int arrIndex = 0;
//        for(int i = 0; i < array.length; i++){
//            if (arrList.contains(array[i])){
//                arrList.set(arrIndex, array[i]);
//            }
//            arrList.add(array[i]);
//            arrIndex++;
//        }
//
//        String[] list = new String[0];
//        return arrList.toArray(list);

    return null;
    }


}
