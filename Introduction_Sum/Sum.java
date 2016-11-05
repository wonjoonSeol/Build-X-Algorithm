/* Build X: Algorithms 2016-17 Introduction
 * Wonjoon Seol k1631098
 * Computer Science with Intelligent Systems 
 * Year 1
 *
 * SCAN first input value and ASSIGN to a variable a
 * SCAN second input value and ASSIGN to a variable b
 * PRINT a+b
 */

import java.util.Scanner;	//always import scanner!

public class Sum { 

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);	//what is System.in? Copied Scanner class to scan, so perhaps the System.in is finding 'in' variable from System
		int a = scan.nextInt();					//use captial i for scan.nextInt
      	int b = scan.nextInt();
      	System.out.print(a+b);					//need to use print in this platform
	}
}