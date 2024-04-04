/*Q1: Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

For example,

Input: X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
Y[] = { 1, 8, 9, 10, 15 } The vacant cells in X[]
 */


 import java.util.*;

 public class MergeArrays {
     public static void mergeArrays(int[] X, int[] Y) {
         int m = X.length;
         int n = Y.length;
         int k = 0;
         for (int i = 0; i < m; i++) {
             if (X[i] == 0) {
                 X[i] = Y[k];
                 k++;
             }
         }
         Arrays.sort(X);
     }
 
     public static void main(String[] args) {
         int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
         int[] Y = { 1, 8, 9, 10, 15 };
         mergeArrays(X, Y);
         System.out.println("Merged Array: " + Arrays.toString(X));
     }
}