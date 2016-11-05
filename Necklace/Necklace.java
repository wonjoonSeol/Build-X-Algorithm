/* Build X: Algorithms 2016-17 Necklcae
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Necklace { 

	public static void main(String[] args) { 
		
		ArrayList<Integer> Necklace = new ArrayList<Integer>();
    	ArrayList<Integer> Sequence = new ArrayList<Integer>();
      	Scanner scan = new Scanner(System.in);
      
      	int n = scan.nextInt();	
      	int k = scan.nextInt();	
      
      	for (int i=0; i<n; i++) {
      		Necklace.add(scan.nextInt());
        }
      
      	int x = 0;
      	for (int i=0; i<k; i++){
          x = Necklace.get(0);
		  Necklace.remove(0);
          Necklace.add(x);
        }
      	
      	int length = 1;
      	
      	for (int i=0; i<n; i++){     
          length = 1;
          for (int j=i+1; j<n; j++) {
             if (Necklace.get(i) == Necklace.get(j)) {  
              length = length + 1;           
            }else if (Necklace.get(i) != Necklace.get(j)) {
              j = n;
            }        
          }
           Sequence.add(length);
        }
      
        int max = Sequence.get(0);
      
       for (int i=0; i<Sequence.size()-1; i++){
         if (max < Sequence.get(i+1))
           max = Sequence.get(i);
       } 
          System.out.print(max);
	}
}