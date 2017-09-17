/**
 * 
 */
/**
 * @author echo
 *
 */
package qbrating;

import java.util.Scanner;

public class cMain {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("how many TOUCHDOWNS?");
		double TD = input.nextDouble();
		System.out.println("how many yards?");
		double yards= input.nextDouble();
		System.out.println("how many Interceptions");
		double INT= input.nextDouble();
		System.out.println("how many completions?");
		double comp= input.nextDouble();
		System.out.println("how many atts?");
		double ATT= input.nextDouble();
		
		double a = ((comp / ATT) - 0.3) * 5;
		double b = ((yards/ATT) - 3) * 0.25;
		double c = (TD / ATT) * 20;
		double d = 2.375 - ((INT / ATT) * 25);
		
		double QB_rating  = ((a+b+c+d)/6)*100;
		System.out.printf("The rating is %.2f: ", QB_rating);
		
		
		
		
		
		
		
		
	}

}