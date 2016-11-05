/* Build X: Algorithms 2016-17 Eliminations
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Eliminations {
		
	static ArrayList<Integer> NumberList;	 //private?
	static ArrayList<Integer> QuestionList;		
  
		public static void main(String[] args){
		
			Scanner scan = new Scanner(System.in);		
			NumberList = new ArrayList<Integer>();		//NumberList number to remove from the interval
          	QuestionList = new ArrayList<Integer>();	//Question to test
          
			int removingNumbers = scan.nextInt();	//removing number value of the number to remove
			int qNumber = scan.nextInt();			//qNumber number of questions
          
			for(int i=0; i<removingNumbers; i++) {
				NumberList.add(scan.nextInt());
			}
          	
          	for(int i=0; i<qNumber; i++) {
            	QuestionList.add(scan.nextInt());
            }
			scan.close();
          
		    int totalSum = 0;
			int notHere = 0;	//notHere increment 1 each time there is a number smaller than the given number. This is to avoid generating all integers up to 10,000,000
          		for(int i=0; i<qNumber; i++) {
            			notHere = 0;	//start of the 'tree' initilise notHere with 0
              				
					for (int j=0; j<removingNumbers; j++){
						if	(NumberList.get(j) != QuestionList.get(i)){ //this exclude when a value from Numberlist equal to a value from questionList
							if (NumberList.get(j) < QuestionList.get(i)){
                			  	notHere = notHere + 1;
							}
                  
                  			if (j == removingNumbers - 1){
                   	 			totalSum = totalSum + QuestionList.get(i)-notHere;
                			}
						}	
		            }
				}
			System.out.print(totalSum);		
 	    }
}
