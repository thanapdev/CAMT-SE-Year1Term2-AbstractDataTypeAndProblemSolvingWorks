// ID : 642115022
// NAME : Thanapong Yamkamol

import java.util.Scanner;   
class palindrome  
{  
   public static void main(String args[])  
   {  
      String inputword = ""; // origunal word
      String outputword = ""; // reverse word

      Scanner input = new Scanner(System.in);   

      System.out.println("input something program will check it!");
      System.out.print("input here ! : ");
      inputword = input.nextLine();

      int length = inputword.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         outputword = outputword + inputword.charAt(i);  

      if (inputword.equals(outputword))  
         System.out.println("THIS IS PALINDROME WORD !"); // reverse word is match to original word
      else  
         System.out.println("THIS IS NOT PALINDROME WORD !"); // reverse word is not match to original word
   }  
}  