/*Ques 2: A supermarket sells thousands of products. Every product is properly packaged and
the product packaging shows the total price a customer must pay for the product.
The total product price includes taxes and the rate of taxation varies from product to
product. For legal reasons, the supermarket must provide invoices to every customer
that show the price of each product before taxes, the tax rate and the tax amount.
Write a program that takes the net price of a product including taxes and the tax rate,
and computes the gross price before taxes. The table below shows some examples
for the expected output of the program. */

import java.util.Scanner;
public class problem2 {
    public static float productPricing(float netPrice, float taxRate){
        // To get the total tax rate as the resulting netPrice is obtained by adding the taxed amount with the grossPrice
        taxRate = 1+taxRate;
        // Declaring the grossPrice varible which is equal to netPrice by taxRate
        float grossPrice = netPrice/taxRate;
        return grossPrice;
    }
    public static void main(String[] args) {
        // Creating the object of scanner class to take input
        Scanner sc = new Scanner(System.in);
        // Declaring variable netPrice and taxRate to store the value of user input such as netPrice and taxRate
        System.err.print("Enter netPrice: ");
        float netPrice = sc.nextFloat();
        System.out.print("Enter taxRate: ");
        float taxRate = sc.nextFloat();
        // Calculating the gross price using the productPricing method
        float grossPrice = productPricing(netPrice, taxRate);
        // Priting the final result
        System.out.println(String.format("%.2f", grossPrice));
        // Closing the scanner class
        sc.close();
    }
}
