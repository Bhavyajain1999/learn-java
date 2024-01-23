import java.util.Arrays;
import java.util.Scanner;

public class array_challenge {
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number  ");
        int num = input.nextInt();;
        return num;
    }
    public static void main(String[] args) {
        // find sum and average of all elements in an array

        int[] a = {1,2,3,4,5,6};
        int[] a1 = {7,8,9,10,11,12};
        int i = 0;

        int b = sum(a);
        float c = avg(a);
        int d = count(a);
        int minimum = min(a);
        int maximum  = max(a);
        int toDelete = 3 ;
        int[] afterDeletion = deleteElement(a,toDelete);

        System.out.println("sum of all elements is " + b);
        System.out.println("avg of all element is " + c);
        System.out.println("total number of elements is  " + d);
        System.out.println("minimum value in array is  " + minimum);
        System.out.println("max value in array is  " + maximum);
        System.out.println("array is sorted : " + checkArraySort(a));
        System.out.println("New array: " + Arrays.toString(afterDeletion)); // Output: [1, 2, 4, 5];
        reverseArray(a);
        System.out.println("reverse array is "+ Arrays.toString(a));
        System.out.println("array is pallindrome " +isPalindrome(a));
        System.out.println("merge of a and a1 is " +Arrays.toString(mergeArrays(a,a1)));



        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int elementToSearch = 5;

        // Search for the element in the 2D array
        int[] result = searchIn2DArray(array, elementToSearch);

        if (result != null) {
            System.out.println("Element " + elementToSearch + " found at position: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element " + elementToSearch + " not found in the 2D array.");
        }


        int[] result_2d_array = calculateSumAndAverage(array);

        int sum = result_2d_array[0];
        double average = result_2d_array[1];

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);

        int sumOfdiagonals = sumOfDiagonalElements(array);

        System.out.println("Sum of diagonal elements: " + sumOfdiagonals);
    }

    public static int sum(int[] a){
        int s = 0;
        int i = 0;
        while (i < a.length){
            s = s + a[i];
            i++;
        }
        return s;
    }
    public static float avg(int[] a){
        float av = 0;
        int i = 0;

        while (i < a.length) {
            av = av + a[i];
            i++;
        }
        float length = a.length;
        av = av/length;
        return av ;
        }
    public static  int count(int[] a ){
        int count = 0;
        int i = 0;
        while (i < a.length){
            i++;
            count++;
        }
        return count;
    }
    public  static int min(int[] a){
        int i = 0;
        int min = a[0];
        while(i < a.length){
            if (min >= a[i]){
                min = a[i];
            }
            else {
                min = a[0];
            }
            i++;
        }
        return min;
    }
    public  static int max(int[] a){
        int i = 0;
        int max = a[0];
        while(i < a.length){
            if (max <= a[i]){
                max = a[i];
            }
            else {
                max = a[0];
            }
            i++;
        }
        return max;
    }
    public static boolean checkArraySort(int[] a){
        int i = 0;
        while (i < a.length - 1 && a[i] <= a[i + 1]) {
            i++;
        }

        if (i == a.length - 1) {
            return true; // Array is sorted in ascending order
        }

        i = 0;

        // Check descending order
        while (i < a.length - 1 && a[i] >= a[i + 1]) {
            i++;
        }

        return i == a.length - 1;



    }
    public static int[] deleteElement(int[] arr, int elementToDelete) {
        int newLength = arr.length - 1; // Account for the element being removed
        int[] newArr = new int[newLength];

        int j = 0; // Index for the new array
        int i = 0; // Index for the original array

        while (i < arr.length) {
            if (arr[i] != elementToDelete) {
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }
    public static boolean isPalindrome(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] != arr[j]) {
                return false; // Not a palindrome if elements at i and j don't match
            }
            i++;
            j--;
        }

        return true; // Palindrome if all elements match
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;



        // Copy remaining elements from the first array
        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements from the second array
        while (j < arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static int[] searchIn2DArray(int[][] arr, int target) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    result[0] = i; // Row index
                    result[1] = j; // Column index
                    return result;
                }
            }
        }

        return null; // Element not found
    }
    public static int[] calculateSumAndAverage(int[][] arr) {
        int[] result = new int[2];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                count++;
            }
        }

        result[0] = sum; // Sum of all elements
        result[1] = (count != 0) ? sum / count : 0; // Average of all elements

        return result;
    }
    public static int sumOfDiagonalElements(int[][] arr) {
        int sum = 0;

        // Check if the matrix is square
        if (arr.length == arr[0].length) {
            int n = arr.length;

            // Sum the elements on the main diagonal (top-left to bottom-right)
            for (int i = 0; i < n; i++) {
                sum += arr[i][i];
            }

            // Sum the elements on the other diagonal (top-right to bottom-left)
            for (int i = 0; i < n; i++) {
                sum += arr[i][n - 1 - i];
            }
        } else {
            System.out.println("Matrix is not square. Cannot calculate diagonal sum.");
        }

        return sum;
    }

}



