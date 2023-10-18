/*This program takes you on carpet buying journey.
 * It will prompt you for price, length and width for 3 carpets. 
 * It will add tax and sum up the prices to output the total cost. 
 * 
 */

import java.util.Scanner;

public class carpet_price {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
        //varibles 
          System.out.println("Enter price of carpet per sq foot:");  
          double price = scnr.nextDouble();
          System.out.println("Enter length:");
          int len = scnr.nextInt();
          System.out.println("Enter width");
          int wid = scnr.nextInt();
          
          double base_cost = (len*wid)*price;
          double cost_with_waste = base_cost+(.2*base_cost);
          double tax = ((len*wid*.75)+(cost_with_waste))*.07;
          System.out.println("Order #1");
          System.out.println("Room: "+len*wid+" sq ft");
          System.out.printf("Carpet: $%.2f\n",cost_with_waste);
          System.out.printf("Labor: $%.2f\n",len*wid*.75);
          System.out.printf("Tax: $%.2f\n",tax);
          System.out.printf("Cost: $%.2f\n",tax+cost_with_waste+(len*wid*.75));
          System.out.println();
          
          //varibles 2
          System.out.println("Enter second price:");
          double price2 = scnr.nextDouble();
          System.out.println("Enter second length:");
          int len2 = scnr.nextInt();
          System.out.println("Enter second width:");
          int wid2 = scnr.nextInt();
          
          double base_cost2 = (len2*wid2)*price2;
          double cost_with_waste2 = base_cost2+(.2*base_cost2);
          double tax2 = ((len2*wid2*.75)+(cost_with_waste2))*.07;
          System.out.println("Order #2");
          System.out.println("Room: "+len2*wid2+" sq ft");
          System.out.printf("Carpet: $%.2f\n",cost_with_waste2);
          System.out.printf("Labor: $%.2f\n",len2*wid2*.75);
          System.out.printf("Tax: $%.2f\n",tax2);
          System.out.printf("Cost: $%.2f\n",tax2+cost_with_waste2+(len2*wid2*.75));
          System.out.println();
          
          //varibles3 
          System.out.println("Enter third price:");
          double price3 = scnr.nextDouble();
          System.out.println("Enter length:");
          int len3 = scnr.nextInt();
          System.out.println("Enter width:");
          int wid3 = scnr.nextInt();
          
          double base_cost3 = (len3*wid3)*price3;
          double cost_with_waste3 = base_cost3+(.2*base_cost3);
          double tax3 = ((len3*wid3*.75)+(cost_with_waste3))*.07;
          System.out.println("Order #3");
          System.out.println("Room: "+len3*wid3+" sq ft");
          System.out.printf("Carpet: $%.2f\n",cost_with_waste3);
          System.out.printf("Labor: $%.2f\n",len3*wid3*.75);
          System.out.printf("Tax: $%.2f\n",tax3);
          System.out.printf("Cost: $%.2f\n",tax3+cost_with_waste3+(len3*wid3*.75));
          System.out.println();
          
          
          double fin = (tax3+cost_with_waste3+(len3*wid3*.75))+(tax2+cost_with_waste2+(len2*wid2*.75))+(tax+cost_with_waste+(len*wid*.75));
          
          System.out.printf("Total Sales: $%.2f\n", fin);
    }   
   }
}
