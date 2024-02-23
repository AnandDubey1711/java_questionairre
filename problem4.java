/*Ques 4: Write a program that finds the median of a sorted array of numbers, where the
median of an array is defined as the number exactly in the middle of the sorted array.
When the array contains an odd number of numbers, the median is the number
exactly in the middle and when the array contains an even number of numbers, the
median is the average of the two numbers exactly in the middle. The table below
shows some sorted arrays, their middle elements and their medians.
 */

import java.util.*;

public class problem4 {
    public static float medianOfSortedArray(float[] array, int arrayLength){
        // Sorting the array in case sorted input in not provided by the user
        Arrays.sort(array);
        // Checking for boundary condition
        if(arrayLength==0) return 0;
        float median = 0;
        // Storing the middle of array in the mid variable
        int mid = arrayLength/2;
        // Checking if the length of array is even or odd and generating the resultant median based on the length of array
        if(arrayLength%2==0){

            median = (array[mid]+array[mid-1])/2;
        }else{
            median = array[mid];
        }
        // Returning the median of the array
        return median;
    }
    public static void main(String[] args) {
        // Initializing an object of scanner class
        Scanner sc = new Scanner(System.in);
        // Taking length as an input
        System.out.println("Enter the length of array");
        int arrayLength = sc.nextInt();
        // Creating an array with the length taken as input
        float[] array = new float[arrayLength];
        // Using the for loop to assign value to each index within the array
        for(int i=0;i<arrayLength;i++){
            System.out.print("Enter value at index "+i);
            array[i] = sc.nextFloat();
        }
        // Calculating the result by calling the function and storing the result in a float variable named resultingMedian
        float resultingMedian = medianOfSortedArray(array, arrayLength);
        System.out.println(resultingMedian);
        // Closing the object of scanner class
        sc.close();
    }
}
