package module01;
//import

//class definition
public class Hello{
       //global variable
	  
	  //main
	public static void main(String args[]) {
		 int a,b,sum,sub,mul,div,mod;
		 a=Integer.parseInt(args[0]);
		 b=Integer.parseInt(args[1]);
		 sum=a+b;
		 sub=a-b;
		 mul=a*b;
		 div=a/b;
		 mod=a%b;
		 System.out.println("Addition="+sum);
		 System.out.println("Subtraction="+sub);
		 System.out.println("Multiplication="+mul);
		 System.out.println("Division="+div);
		 System.out.println("Modulus="+mod);
    }
}
