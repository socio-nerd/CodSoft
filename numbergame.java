package numberguessgame;
import java.util.Scanner;


public class numbergame {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = 1+ (int)(100*Math.random());
		int trial = 4;
		int i,guess;
		System.out.println(
	            "A number is picked"
	            + " between 1 to 100."
	            + "Guess the number"
	            + " within 4 trials.");
	 for( i =0;i<trial;i++) {
		 System.out.println("Guess the  number");
		 guess = scn.nextInt();
		 if(n == guess) {
			 System.out.println(
	                    "Congratulations!"
	                    + " You guessed the number.");
	                break;
	            }
	            else if (n > guess
	                     && i != trial- 1) {
	                System.out.println(
	                    "The number is "
	                    + "greater than " + guess);
	            }
	            else if (n < guess
	                     && i != trial - 1) {
	                System.out.println(
	                    "The number is"
	                    + " less than " + guess);
	            }
	        }
	 if (i == trial) {
         System.out.println(
             "You have exhausted"
             + " 4 trials.");

         System.out.println(
             "The number was " + n);
     }
 }
			 
		 
		
	}


