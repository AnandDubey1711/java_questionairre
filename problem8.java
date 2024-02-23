/*Ques: Write a program that accepts the number of seconds and returns its time equivalent
in days, hours, minutes and seconds. For example, given “21893872” (without
quotes), the program must return “253 Day(s) 9 Hour(s) 37 Minute(s) 52 Second(s)”
(without quotes).
 */

import java.util.Scanner;

public class problem8 {
    public static String timeConverter(int seconds){
        // The days variable stores the number of seconds converted into days by dividing seconds with per min, per hour and per day
        int days = (seconds)/(60*60*24);
        // Hours variable first calculates the remaining seconds after the days variable and these remaining seconds are then converted to hours 
        int hours = (seconds%(60*60*24))/(60*60);
        // Minutes variable calculates the remaining seconds after the hours and these seconds are converted to minutes
        int minutes = (seconds%(60*60))/60;
        // Remaining seconds is stores the remaining number of seconds after all the other seconds have been allocated 
        int remainingSeconds = seconds%60;
        // Method returns a string value
        return days + " Day(s) " + hours + " Hour(s) " + minutes + " Minute(s) " + remainingSeconds + " Second(s)";
    }
    public static void main(String[] args) {
        // Initializing the object of scanner class
        Scanner sc = new Scanner(System.in);
        // Taking the input from the user with the help of scanner class
        System.out.println("Enter the number of seconds");
        int seconds = sc.nextInt();
        // The resulting conversion is done with the help of time converter method which is then printed after execution
        System.out.println(timeConverter(seconds));
        // The object of scanner class is closed after execution
        sc.close();
    }
}
