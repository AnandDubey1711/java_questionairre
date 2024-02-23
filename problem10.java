// Ques 10: Write a program that finds the second largest number from an array of unsorted
// numbers.
import java.util.Scanner;
public class problem10 {
    public static int secondLargest(int[] array, int arrayLength){
        // Initializing the max and secondMax variable which will store the highest and second highest values
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        // For loop iterates over the loop where comparison between max and every element of array is carried out to find the max element
        // Simultaneously the previous values of max is assigned to the secondMax variable which helps in obtaining the secondMax value
        for(int i=0;i<arrayLength;i++){
            if(array[i]>max){
                secondMax = max;
                max = array[i];
            }
            if(array[i]>secondMax && array[i]!=max){
                secondMax = array[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        // Initializing the object of scanner class to take input from the user
        Scanner sc = new Scanner(System.in);
        // Using arrayLength variable to get the length of the array
        System.out.print("Enter the length of array: ");
        int arrayLength = sc.nextInt();
        // An array is initialized in which the value is inserted using the for loop
        int[] array = new int[arrayLength];
        for(int i=0;i<arrayLength;i++){
            System.out.print("Enter the value at index "+ i +" :");
            array[i] = sc.nextInt();
        }
        // The result variable is used to store the result by calling the secondLargest method which returns the secondLargest element in the array
        int result = secondLargest(array,arrayLength);
        // Printing the resulting value
        System.out.println(result);
        // Closing the object of scanner class after the execution of the program
        sc.close();
    }
}
