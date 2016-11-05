/* Build X: Algorithms 2016-17 GreedyAndrew
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 */

import java.util.Scanner;
import java.util.ArrayList;

public class GreedyAndrew { 

  	static ArrayList<Float> Numlist;		//Numlist odd value = weight, even value = price
  	static ArrayList<Float> possiblePrice;	//All possible prices under the given weight bagLimit
  
	public static void main(String[] args) {
      	Numlist = new ArrayList<Float>();
      	possiblePrice = new ArrayList<Float>();
      	Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();
		float bagLimit = scan.nextFloat();		
		
      	for (int i=0; i < arraySize; i++){
			Numlist.add(scan.nextFloat());
		}
		scan.close();		

		float nowPrice = 0.0f;			//current price
		float maxPrice = 0.0f;			//maximum price. this will be the final answer
		
		priceCalculator(0.0f, 0.0f, bagLimit, arraySize, 0);
		
      //iterate all possiblePrice and find maxPrice
		for (int i=0; i<possiblePrice.size(); i++) {
			nowPrice = possiblePrice.get(i);
          

			if (nowPrice>maxPrice) {
			maxPrice = nowPrice;    	
			}
		}
		System.out.print(maxPrice);
	}
 
  /**
   *Method priceCalculator with double nested loops to go through every 2^n possiblities.
   */
  	public static void priceCalculator(float currentWeight, float currentPrice, float bagLimit, int arraySize, int current) {     	
      	for (int i=current; i<=arraySize; i++) {
			for (int j = current; j<arraySize; j++) {
            	if (j == i) {	//if start of the tree, re-initialise with 0
                    	currentWeight = 0.0f;
						currentPrice = 0.0f;	
                }
                if (currentWeight + Numlist.get(2*j) <= bagLimit) {
						currentWeight = currentWeight + Numlist.get(2*j);
						currentPrice = currentPrice + Numlist.get(2*j+1);
						if (j == arraySize-1) {
                      		possiblePrice.add(currentPrice);
						}
				}
                  		priceCalculator (currentWeight, currentPrice, bagLimit, arraySize, current+1);              
			}

			
		}
	}
}
