package ecommerce;

public class Main {

	public static void main(String[] args) {
		
		
		Seller onur = new Seller(0, "Onur KARCI", "1234");
		Customer abd = new Customer(1, "Aburrahman KAR" , "1234","Bilkent");
		
		ECommerceSys.users.add(abd);
		ECommerceSys.users.add(onur);
		
		
		Product gaming_laptop = new TechProduct(100,0,"Monster",90000,3,"Intel",3,"laptop",2025,true);
		ECommerceSys.addProduct(gaming_laptop);
		
		
		OrderItem oitem  = new OrderItem(gaming_laptop.getId(), 1);
		Order order = new Order(0, 1);
		ECommerceSys.addToOrder(oitem, order);
		
		
		
		
	}

}
