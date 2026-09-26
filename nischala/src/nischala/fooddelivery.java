package nischala;

public class fooddelivery {
	String food;
	int quantity;
	void displayorder() {
		System.out.println("food:  "+food);
		System.out.println("quantity:  "+quantity);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fooddelivery order1=new fooddelivery();
		order1.food="Pizza";
		order1.quantity=2;
		fooddelivery order2=order1;
		order2.quantity=3;
		order1.displayorder();

	}

}
