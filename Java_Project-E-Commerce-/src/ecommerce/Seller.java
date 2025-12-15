package ecommerce;

public class Seller extends User{
	
	
	
	public Seller(int id, String username, String password) {
		super(id, username, password);
	}
	public String toString() {
		return "Seller"+super.toString();
	}
}

