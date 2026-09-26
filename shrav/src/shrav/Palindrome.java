package shrav;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		while(n>0) {
			int digit=n%10;
			int n=n/10;
			int rev=rev*10+digit;
			
		}
		System.out.println("Reverse"+rev);
		
	}

}
