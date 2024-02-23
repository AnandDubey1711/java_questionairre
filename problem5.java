// Write a program that computes the income taxAmount for a person having specified income,
// using the income taxAmount rates shown below.

import java.util.Scanner;

public class problem5 {
    public static double incomeTaxCalculation(double income) {
        double taxAmount = 0;
        // if else loop is used to calculate the taxed amount
        // if income is less than a certain amount no tax is imposed
        if (income <= 250000) {
            taxAmount = 0;
        } 
        // if income is more than 2500000 and less than 5000000 than the tax is imposed on the remaining amount
        else if (income <= 500000) {
            taxAmount = (income - 250000) * 0.10;
        }
        // if income is less than 1000000 than tax amount is calculated based on the different tax rate for each slab 
         else if (income <= 1000000) {
            taxAmount = (250000 * 0.10) + ((income - 500000) * 0.20);
        } 
        // if income is more than 1000000 than the tax amount is calculated based on the different tax rate for each slab as well
        else {
            taxAmount = (250000 * 0.10) + (500000 * 0.20) + ((income - 1000000) * 0.30);
        }
        return taxAmount;
    }
    public static void main(String[] args) {
        // Creating the object of scanner class to take input from the user
        Scanner sc = new Scanner(System.in);
        // The income is taken as input from the user
        System.out.print("Enter the income: ");
        double income = sc.nextDouble();
        // taxAmount is calculated using the income Tax Calculation method
        double taxAmount = incomeTaxCalculation(income);
        System.out.println(taxAmount);
        // Object of scanner class is closed after the execution of the program
        sc.close();
    }
}
