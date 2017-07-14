import java.util.Random;
import java.util.Scanner;

/*
 * Program 3
 * Modify your previous number guessing game so that they can guess 
 * until they get it right. That means it will keep looping as long 
 * as the guess is different from the secret number. Use a while loop.
 * 
 * */

public class NumberGuessingGame3 {
	public static void main(String[] args){
	// Initialize Scanner Object
			Scanner in = new Scanner(System.in);
			// Initialize random object
			Random random = new Random();
			// maximum possible number
			int max = 10;
			//minimum possible number
			int min =1;
			/*variable that will hold the value of the user guess 
			 * initialize as 100 , since 100 is not a possible answer/option
			*/
			int answer =100;
			// randomNum is initialize to 0
			int randomNum =0;
			// generate random number from 1 to 10
			randomNum = random.nextInt(max - min + 1 ) + min;
			
				System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
				
			while(answer != randomNum){
				
				
				System.out.print("\nYour guess: ");
				answer = in.nextInt();
				
				if(answer != randomNum)System.out.println("That is incorrect. Guess again.");
			}
			
			System.out.print("That's right! You're a good guesser.");
			
	}			
}
