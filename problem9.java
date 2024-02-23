/*Ques 9: A two-digit special integer is obtained by adding its individual digits to the product of
the digits. For example, the special two-digit integer “59” is obtained as “5 + 9 + 5 x 9
= 5 + 9 + 45”.
Write a program that accepts an integer and determines if it is a two-digit special
integer. */
import java.util.Scanner;

public class problem9 {
    public static boolean summationAndProduct(int num){
        // Initializing the variables summation to store the sum of all digits 
        int summation = 0;
        // Product variable is declared to store the product of all digits in the integer
        int product= 1;
        // Remainder variable is declared to store the remainder after the modulo operation on the num 
        int remainder = 0;
        int initialValue = num;
        // while loop is used to iterate the integer until it is not equal to zero. Within the while loop summation and product are calculated
        while(initialValue!=0){
            remainder = initialValue%10;
            summation += remainder;
            product*=remainder;
            initialValue/=10;
        }
        // Resultant variable stores the sum of summation and product of digits of the integer
        int resultantValue = summation+product;
        // True or false is returned based on the fact whether the calculated integer consists of special digits or not
        return (resultantValue==num)?true:false;
    }
    public static void main(String[] args) {
        // Object of scanner class is created to take input from the user
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value: ");
        int value = sc.nextInt();
        // boolean value is used to store the returned value from them method
        boolean result = summationAndProduct(value);
        // based on result's a certain output would be generated if true the value given by the user is special else otherwise
       if(result){
         System.out.println("It is a special integer");
       }
       else {
        System.out.println("It is not a special integer");
       }
    //    closing the object of scanner class after the execution of the program
        sc.close();
    }
}
