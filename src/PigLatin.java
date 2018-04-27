import java.util.Scanner;

// author: Brent Coppinger Version 0.0.1

public class PigLatin{

	       public static void main(String[] args)
	      {
	         String word;
	         String latin = "";
	         char first,ans = 'n';
	         boolean cap = false;
	         String line;
	         Scanner scan = new Scanner(System.in);
	         do {
	         System.out.print("enter line to translate: ");
	         line = scan.nextLine();
	      	Scanner scan2 = new Scanner(line);
	         while (scan2.hasNext())
	         {
	            word = scan2.next();
	            first = word.charAt(0);
	            if ('A' <= first && first <= 'Z') 
	            {
	               first = Character.toLowerCase(first);
	               cap = true;
	            }
	            else
	         		cap = false;
	            if (first=='a' || first=='e' || first=='i' || first=='o' || first=='u')
	               latin = word + "way";
	            else
	            {	
	               if (cap)
	               {
	                  latin = "" + Character.toUpperCase(word.charAt(1)); 
	                  latin = latin + word.substring(2) + first + "ay";
	               }
	               else
	                  latin = word.substring(1) + first + "ay";
	            }
	         
	            System.out.print(latin + " ");
	         }
	         System.out.println("Continue?");
	         ans = scan.next().charAt(0);
	      } while ((ans != 'n') && (ans != 'N'));
	       scan.close();
	      }
	      }
	   