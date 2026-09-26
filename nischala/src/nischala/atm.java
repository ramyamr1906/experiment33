package nischala;

public class atm {
	int accountnumber;
	double balance;
		void deposite(double amount) {
		balance=balance+amount;
		System.out.println("Amount Deposited : "+amount);
	}
		void withdrawn(double amount) {
			if(amount<=balance) {
			balance=balance-amount;
			System.out.println("Amount Withdrawn : "+amount);}
			else {
				System.out.println("Insufficient balance");
			}}
			void displaybalance() {
				System.out.println("Account Number : "+accountnumber);
				System.out.println("Current Balance: "+balance);
				
			}
			
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			atm a=new atm();
			a.accountnumber =1234567898;
			a.balance=5000;
			a.displaybalance();
			a.deposite(2000);

	}

}
