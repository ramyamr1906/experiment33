package SUS;

import java.util.Scanner;

public class Imposter2 {
	public static void main(String[] args) {
		
		Scanner m = new Scanner(System.in);
		
	System.out.print("Enter Number of elements: ");
		
		int n = m.nextInt();
		int[] el = new int[n];
		System.out.println("Enter"+ "\t" +n+"\t" + "elements: ");
		for(int i = 0 ; i < n ;  i++) {
			el[i] = m.nextInt();}
		
		int sum = 0;
		
		for(int  j = 0 ;j < el.length ; j++) {
				sum = sum + el[j];
		}
		
		System.out.print("\n" + "Hence the Khidhi of numbers is: " + sum);
		
	}

}
