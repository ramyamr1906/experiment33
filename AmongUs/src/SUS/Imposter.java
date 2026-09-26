package SUS;

import java.util.Scanner ;


public class Imposter {

	public static void main(String[] args) {
		
		int[] arr  = {1,2,3,4,5};
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print("\t" +arr[i] + "\n" );
		}
		
		Scanner c = new  Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		
		int n =  c.nextInt();
		int [] marks =new int[n];
		System.out.println("Enter"+ n + "elements: ");
		for(int i = 0 ; i < n ;  i++) {
			marks[i] = c.nextInt();	
		}
		
		System.out.println("Array elements are: ");
		for(int j =0 ; j <n ; j++) {
			System.out.print(marks[ j ] + "\t") ;}
		
		}
		
		
	}


