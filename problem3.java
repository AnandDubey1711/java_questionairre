// Ques3: Write a program that accepts two numbers and returns the larger of the two.
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        // Creating an object of scanner class to take input from the user
        Scanner sc = new Scanner(System.in);
        // Taking input from the user as value1 and value2
        System.out.print("Enter first value: ");
        double value1 = sc.nextDouble();
        System.out.print("Enter second value: ");
        double value2 = sc.nextDouble();
        // Checking among both the value which one is higher and assigning the same to a third variable named higherValue
        double higherValue = (value1>=value2)?value1:value2;
        // Printin the resultant value 
        System.out.println(higherValue);
        // Closing the scanner class object
        sc.close();
    }
}
