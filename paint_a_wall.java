import java.util.Scanner;

public class paint_a_wall {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
        System.out.println("Enter wall height:");
          double h = scnr.nextDouble();
          System.out.println("Enter wall width");
          double w = scnr.nextDouble(); 
          System.out.println("Enter price of paint");
          double price = scnr.nextDouble(); 
          
          //Wall area
          double ws = h*w;
          System.out.printf("Wall area: %.1f sq ft\n", ws);
          
          //Gallons needed
          double gallon = 350.0;
          double needed = ws/gallon;
          System.out.printf("Paint needed: %.3f gallons\n", needed);
          
          //Cans needed
          int cans = (int)Math.ceil(needed);
          System.out.printf("Cans needed: "+ cans + " can(s)\n");
          
          //Cost
          double base_price = price*cans;
          System.out.printf("Paint cost: $%.2f\n" ,base_price);
          
          //Tax
          double tax_rate = .07;
          double tax = base_price*tax_rate;
          System.out.printf("Sales tax: $%.2f\n" ,tax);
          
          //Final cost
          double final_cost = tax + base_price;
          System.out.printf("Total cost: $%.2f\n" ,final_cost);
    }
      
   }
}
