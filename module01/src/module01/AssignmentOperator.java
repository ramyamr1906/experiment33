package module01;

public class AssignmentOperator {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		System.out.println("a="+a);
		a+=5;
		System.out.println("a+=5"+a);
		a-=3;
		System.out.println("a-=3"+a);
		a*=2;
		System.out.println("a*=2"+a);
		a/=4;
		System.out.println("a/=4"+a);
		
		System.out.println("a++"+ a++);
		System.out.println("a++"+ ++a);
		}
}
