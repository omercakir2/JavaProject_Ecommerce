package ecommerce;

public class Customer extends User{
	private String address;
	
	public Customer(int id , String name ,String password,String address) {
		super(id,name,password);
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
