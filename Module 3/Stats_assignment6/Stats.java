
/**
 * Given an array of integers Find the mean, median, mode, standard deviation
 * and variance.
 * 
 * Mean
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Median
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Mode
 * Input : [1,1,2,2,3]
 * Output : [1,2]
 * 
 * Variance
 * Input : [1,2,3,4,5]
 * Output : 2.0
 * 
 * Standard Deviation
 * Input : [1,2,3,4,5]
 * Output : 1.41421356
 * 
 * @author Siva Sankar
 */

import java.util.*;

public class Stats {

    /**
     * This method should return the mean of the elements of the array. If the arr
     * is empty (length is 0), return the mean as 0.
     * 
     * @param arr, the input array contians elements.
     * @return the mean of the array.
     */
    public static double mean(int[] arr) {
        // Your code goes here....
        double sum = 0.0;
        double mean = 0;
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
                mean = sum / (arr.length);
            }
            return mean;
        }
        return 0.0;
    }

    /**
     * This method returns the median of the elements of the array. Prerequisite :
     * The array should be sorted to find the median.
     * 
     * Hint : Arrays.sort(arr) sorts the elements of the array.
     * 
     * @param arr, the input array contains random elements (not in sorted order)
     * @return the median of the elements of the array.
     */
    public static double median(int[] arr) {
        // Your code goes here...
        Arrays.sort(arr);
        int len = arr.length;
        int num;
        double mean1;
        if (len % 2 == 0) {
            num = len / 2;
            mean1 = (arr[num] + arr[num - 1]) / 2;
            return mean1;
        } else {
            num = len / 2;
            mean1 = arr[num];
        }
        return 0.0;
    }

    /**
     * This method returns the mode of the array. If there is no mode, then it
     * returns 0 as the mode.
     * 
     * @param arr, the input array.
     * @return the mode of the array, 0 otherwise if there is no mode.
     */
    public static int mode(int[] arr) {
        // Your code goes here....
        int maxValue = 0, maxCount = 0, i, j;
        for (i = 0; i < arr.length; i++) {
            int count = 0;
            for (j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    count = count + 1;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[i];
            }
            return maxValue;
        }
        return 0;
    }

    /**
     * This method returns the variance of the input array. Make use of the mean
     * functon which has already written.
     * 
     * @param arr, the input array
     * @return the variance of the array.
     */
    public static double variance(int[] arr) {
        // Your code goes here....
        double var = 0;
        for (int i = 0; i < arr.length; i++) {
            var = var + (arr[0] - mean(arr)) * (arr[0] - mean(arr));
        }
        var = var / (arr.length);

        return var;
    }

    /**
     * This method returns the standard deviation of the array. Hint : You can find
     * the square root using Math.sqrt() method.
     * 
     * @param arr, the input array
     * @return the standard deviation of the input array.
     */
    public static double standardDeviation(int[] arr) {
        // Your code goes here....
        double sd;
        sd = Math.sqrt(variance(arr));

        return sd;
    }
}