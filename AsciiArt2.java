import java.util.Scanner;

public class AsciiArt2 {
   public static void main(String[] args) {
      System.out.println("Enter cat name");
      try (Scanner scnr = new Scanner(System.in)) {
         String name = scnr.nextLine();

         
         System.out.println("      /\\_/\\");
         System.out.println(" /\\  / o o \\");
         System.out.println("//\\\\ \\~(*)~/");
         System.out.println("`  \\/   ^ /");
         System.out.println("   | \\|| ||");
         System.out.println("   \\ '|| ||");
         System.out.println("    \\)()-())");
         
         System.out.println("My cat "+name);
      }

   }
}
      