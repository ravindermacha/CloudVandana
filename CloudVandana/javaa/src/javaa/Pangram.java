package javaa;
import java.util.Scanner;
public class Pangram
{
	    public static void main(String[] args) {
	        
	        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	   
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = sc.nextLine().toUpperCase(); 
	          sc.close();
	        boolean isPangram = true; 

	        for (char letter : alphabet.toCharArray()) {
	           
	            if (input.indexOf(letter) == -1) {
	                isPangram = false;
	                break; 
	            }
	        }

	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }
	}


