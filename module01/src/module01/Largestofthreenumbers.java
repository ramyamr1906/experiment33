package module01;

public class Largestofthreenumbers {
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		
		if(a>b && a>c) {
			System.out.println("Largest ="+a);
	    }
		else if(b>a && b>c) {
	    	System.out.println("Largest ="+b);
	    }
		else {
			System.out.println("Largest ="+c);
		}
	    	
	    }

}
