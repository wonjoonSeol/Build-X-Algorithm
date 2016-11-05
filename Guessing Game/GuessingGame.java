/* Build X: Algorithms 2016-17 Guessing Game
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * ASSIGN lowerLimit = 1
 * SCAN first input value and ASSIGN to a variable upperLimit
 * SCAN second input value and ASSIGN to a variable corretNum
 * ASSIGN attemptNum = 1
 * BEGIN LOOP as long as mid value is not equal to correctNum
 * IF mid value is greater than correctNum, ASSIGN upperLimit = mid value
 * OTHERWISE, ASSIGN lowerLimit = mid value, 
 * ASSIGN attemptNum = attemptNum + 1
 * END LOOP
 */

import java.util.Scanner;	//Always import scanner!

public class GuessingGame { 

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
      	int lowerLimit = 0;
		int upperLimit = scan.nextInt();								//variable upper limit N chosen by Tom
		int correctNum = scan.nextInt();								//variable correct number T chosen by Tom
		int attemptNum = 1;												//variable attempt number
	
		while ((upperLimit+lowerLimit)/2 != correctNum) {				//There will be log_2 (n) steps
          		if ((upperLimit+lowerLimit)/2 >= correctNum) {			//Should I assign new variable for the mid-value? Would this be more efficient?
					attemptNum = attemptNum + 1;
					upperLimit = (upperLimit+lowerLimit)/2;	
            	} else {
              		attemptNum = attemptNum + 1;
					lowerLimit = (upperLimit+lowerLimit)/2;
         	   		}
            }
      	System.out.print(attemptNum);
	}
}
