/* Ques: Retail inflation is the average yearly increase in prices of common goods sold in
retail. For example, if the prices of common goods increase on an average by 10% in
a year, the retail inflation is said to be 10%.
Write a program that accepts the rate of retail inflation and number of years, and
prints the compounded inflation at the end of the specified number of years. For
example, if the retail inflation rate is specified as 20% and number of years as 5, the
compounded retail inflation at the end of 5 years will be 1.25 = 2.49 = 149%. */

import java.util.Scanner;
public class problem7 {
    public static double inflationCalculation(double retailInflation, double years){
        // Creating a variable totalInflation to store the overall inflation which includes the original pricing as well and the change
        double totalInflation = 1+retailInflation/100;
        // Using totalInflation and years the compounded Inflation is calculated using the power method of math
        double compoundedInflation=  Math.pow(totalInflation,years);
        // The percentage compunded inflation is returned
        return (compoundedInflation-1)*100;
    }
    public static void main(String[] args) {
        // Object of scanner class is created to take input from the user
        Scanner sc = new Scanner(System.in);
        // The retail inflation is taken as input  from the user as well as number of years
        System.out.print("Enter the rate of retail inflation: ");
        double retailInflation = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        double years = sc.nextDouble();
        // Compounded retail inflation is calculated with the help of inflationCalculation method which reutrns the inflation in perentage format
        double compoundedRetailInflation = inflationCalculation(retailInflation, years);
        // Obtained result is then printed using Math.round method which limits the number count after the decimal
        System.out.println(Math.round(compoundedRetailInflation));
        // Objet of scanner class is close after the execution s
        sc.close();
    }
}
