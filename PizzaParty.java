// Generates number of pizzas needed, tax, delivery fee, and final total for pizzas

import java.util.*;

public class PizzaParty {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
        System.out.println("Enter number of people:");
          int numpeople = scnr.nextInt();
          System.out.println("Enter number of slices per person:");
          double numslice = scnr.nextDouble();
          System.out.println("Enter cost of pizza:");
          double pizzacost = scnr.nextDouble();
          int pizzas_needed = (int)Math.ceil(Math.ceil(numpeople*numslice)/8);
          double final_pizza_cost = pizzas_needed*pizzacost;
          double tax = final_pizza_cost * .07;
          double delivery = (final_pizza_cost + (final_pizza_cost*.07))*.2;
          double total = final_pizza_cost + tax +delivery;
          
          System.out.println(""); 
          System.out.println("Sunday Night Party");
          System.out.printf("%d Pizzas: $%.2f\n",pizzas_needed, final_pizza_cost);
          System.out.printf("Tax: $%.2f\n", tax);
          System.out.printf("Delivery: $%.2f\n", delivery);
          System.out.printf("Total: $%.2f", total);
    }
      System.out.println("\n");
      
   }
   
}

