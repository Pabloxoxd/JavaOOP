package bank;

public class Account {

	public static void main(String[] args) {
		
		Project a1 = new Project("123.55578.8.9.2-00", "Pablo Henrique Montibeller Loes");
		
		a1.openAccount("CA");
		a1.deposit(1500);
		a1.draw(1550);
		a1.currentAccount();
		a1.closeAccount();

	}

}
