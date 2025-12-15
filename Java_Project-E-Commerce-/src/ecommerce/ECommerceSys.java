package ecommerce;

import java.util.ArrayList;
import java.util.HashSet;

public class ECommerceSys {
	public static ArrayList<User> users = new ArrayList<User>();
	public static HashSet<Product> products = new HashSet<>();
	public static HashSet<Order> orders = new HashSet<>();
	
	
	
	
	public static boolean searchUserID(int id) {//if exist return true
		for(User user : users) {
			if(user.getId()==id)
				return true;
		}
		return false;
	}
	
	public static boolean addUser(User user) {
		if(searchUserID(user.getId())) 
		{
			return false;
		}
		users.add(user);
		return true;
	}
	
	public static boolean addToOrder(OrderItem oitem,Order order) {
		return order.addItem(oitem);
	}
	
	public static boolean addProduct(Product product) {
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
	public static Product searchProductById(int id) {
		for(Product pro : products) {
			if(pro.getId()==id) {
				return pro;
			}
		}
		return null;
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
	
	public double getLineItemWeight(OrderItem oitem) 
    {
		
		Product product  = searchProductById(oitem.getProductID());
		if(product != null) {
			
			return product.getShippingWeight() * oitem.getQuantity();
		}
        // Uses the Product's weight and multiplies it by the quantity
		return -1;
    }
    
    public double getLineItemSubtotal(OrderItem oitem)  //calculating the taxIncluded price for the product and how many of it's purchased.
    {
    Product product  = searchProductById(oitem.getProductID());
      double taxRate= product.calculateTax();
      double basePrice=product.getPrice();
      double finalPrice=basePrice*(1+taxRate);
      return(finalPrice*oitem.getQuantity());
    }
}
