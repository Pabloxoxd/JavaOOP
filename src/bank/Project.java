package bank;

public class Project {
	
	public String accNum;
	protected String accType;
	private String owner;
	private float balance;
	private boolean status;
	
	public Project(String accNum, String owner) {
		this.setAccNum(accNum);
		this.setAccType(accType);
		this.setOwner(owner);
		balance = 0;
		status = false;
	}
	
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void openAccount(String t) {
		this.setAccType(t);
		this.setStatus(true);
		
		if(this.accType == "CA") {
			this.setBalance(50);
		} else if(this.accType == "SA" ) {
			this.setBalance(150);
		}
	}
	
	public void closeAccount() {
		
		if(this.balance > 0 || this.balance < 0) {
			System.out.println("ERROR: Your account balance must be 0!!");
		}else {
			this.setStatus(false);
			System.out.println("Account closed");
		}
	}
	public void deposit(float dep) {
		if(this.status == true) {
			this.setBalance(this.getBalance() + dep);
		}else {
			System.out.println("This account doesn't exist");
		}
	}
	public void draw(float draw) {
		if(this.status == false) {
			System.out.println("This account doesn't exist");
		}else if(this.balance < draw){
			System.out.println("You don't have enough money");
		}else {
			this.setBalance(this.getBalance() - draw);
		}
	}
	
	public void currentAccount() {
		System.out.println("Account number: " + this.getAccNum());
		System.out.println("Account type: " + this.getAccType());
		System.out.println("Account balance: " + this.getBalance());
		System.out.println("Account owner: " + this.getOwner());
		System.out.println("Account status: " + this.getStatus());
	}
	
}
	

