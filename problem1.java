// Ques 1: Write a program that prints the number of digits in an integer. For example, given the
// integer “34” (without quotes) as the input, the program must print “2” (without quotes)
// as the output, given “-7291” (without quotes), the program must print “4” (without
// quotes), and so on.

import java.util.Scanner;
public class problem1 {
    public static int digitsInInteger(int num){
        // To keep track of the number of digits
        int count = 0;
        // Checking in the while loop until the num variable is not equal to 0 the count variable would be incremented gradually
          while(num>0 || num<0){
            count++;
            num/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        // Creating an object of Scanner class for taking the input
        Scanner sc = new Scanner(System.in);
        // Taking the input from the user
        int num = sc.nextInt();
        // Calling the method to calculate the number of digits in the integer and storing the value in answer variable
        int answer = digitsInInteger(num);
        // Printing the answer variable which gives the count of number of digits within the integer value
        System.out.println(answer);
        // Closing the scanner class
        sc.close();
    }
}
