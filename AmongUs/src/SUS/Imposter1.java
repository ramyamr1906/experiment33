package SUS;

import java.util.Scanner;

public class Imposter1 {

	public static void main(String[] args) {
		Scanner eo = new Scanner(System.in);
		 
		System.out.print("Enter Number of elements: ");
		
		int n = eo.nextInt();
		int[] el = new int[n];
		System.out.println("Enter"+ "\t" +n+"\t" + "elements: ");
		for(int i = 0 ; i < n ;  i++) {
			el[i] = eo.nextInt();}
		System.out.print("The follwing guys are : \n");
		
		for(int j = 0 ; j < el.length ; j++) {
			if (el[j] % 2 == 0) {
				System.out.print(el[j] +"\t"+ "Is Even" + "\n");}
			else {
				System.out.print(el[j] +"\t"+ "Is Odd" + "\n");}
		}
		

	}

}
