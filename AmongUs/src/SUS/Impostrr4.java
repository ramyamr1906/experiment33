
package SUS;

import java.util.Scanner;

public class Impostrr4 {



	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		
		System.out.print("Enter Number of elements: ");
			
			int key = m.nextInt();
			int[] arr = new int[key];
			boolean found = false;
			
			System.out.println("Enter"+ "\t" +key +"\t" + "elements: ");
			for(int i = 0 ; i < key ;  i++) {
				arr[i] = m.nextInt();}
			
			for(int  j = 0 ;j < arr.length ; j++) {
				if(arr[j] == key) {
					found = true;
					break;}
				}
			
			if(found){
				System.out.println(" Ladies and Gentelmen we got him");}
			else {
				System.out.println("Oh Sh** ! , Here we got again........................................................................................................................... \n ..............................................................................................Suspect not located");
			}
				
		
	}

}
