import java.util.Scanner;
public class StringLength
{
   public static void main(String[] args)
   {
      System.out.println("Enter any string: ");
      Scanner string = new Scanner(System.in);
      String input = string.nextLine();
      String firstChar = input.substring(0,1);
      int length = string.length();
      
      System.out.println(length);
      System.out.println("First letter: " + firstChar);
   }
}
