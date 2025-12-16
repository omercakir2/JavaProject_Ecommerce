package ecommerce;

import java.util.HashSet;

public class ECommerceSys {
	public static HashSet<User> users = new HashSet<>();
	public static HashSet<Product> products = new HashSet<>();
	public static HashSet<Order> orders = new HashSet<>();
	
	
	
	
	public static boolean searchUserID(int id) {//if exist return true
		for(User user : users) {
			if(user.getId()==id)
				return true;
		}
		return false;
	}
	
	public static Product searchProductById(int id) {
		for(Product pro : products) {
			if(pro.getId()==id) {
				return pro;
			}
		}
		return null;
	}
	
	public static boolean addUser(User user) {
		if(users.contains(user)) 
		{
			System.out.println("User is already exist");
			return false;
		}
		users.add(user);
		return true;
	}
	
	public static boolean addToOrder(OrderItem oitem,Order order) {
		return order.addItem(oitem);
	}
	
	public static boolean addProduct(Product product) {
		if(products.contains(product)) {
			System.out.println("Already exists![addProduct()]");
			return false;
		}
		return products.add(product);
	}
	public static boolean removeProduct(Product product){//seller icin
		return products.remove(product);
	}
	
	public static String listProduct(String product_name) {//list the string matches
		String out = "";
		for(Product  pro : products) {
			
			if(pro.getName().matches(product_name)) {
				out += pro  + "\n";
			}
		}
		return out;
	}
	
	public static String displayAllProducts() {
		String out = "";
		for(Product pro : products) {
			out += pro + "\n";	
		}
		return out;
	}
	public static String displayAllOrders() {
		
		String out = "\n All orders :\n------------\n";
		for(Order order : orders) {
				out+= order;
		}
		return out;
	}
	
	
}
