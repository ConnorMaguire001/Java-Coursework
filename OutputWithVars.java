import java.util.Scanner; 

public class OutputWithVars{
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
         int userNum;
         
         System.out.println("Enter integer:");
         userNum = scnr.nextInt();  
  
         System.out.println("You entered: "+ userNum);
         System.out.println(userNum+" squared is " + (userNum*userNum));
         System.out.println("And " + userNum +" cubed is "+ (userNum*userNum*userNum)+"!!");
         
         System.out.println("Enter another integer:");
         int userNum2 = scnr.nextInt();

         int sum = userNum + userNum2;
         int product = userNum * userNum2;
         System.out.println(userNum + " + " + userNum2 +" is " + sum);
         System.out.println(userNum + " * " + userNum2 +" is " + product);
      }
      
   }
}  