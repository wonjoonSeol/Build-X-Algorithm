/* Build X: Algorithms 2016-17 Hanoi
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Hanoi{

  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HanoiRecur(n, 1, 3, 2);
  }
  
	public static void HanoiRecur(int diskNum, int origin, int middle, int destin){
      
        if(diskNum == 1){
          
          System.out.print(origin + "->" + destin + " ");
      
	    }else{
    	    HanoiRecur (diskNum-1, origin, destin, middle);
       		HanoiRecur (1, origin, middle, destin);
			HanoiRecur (diskNum-1, middle, origin, destin);              
		
      }
	
	}
}