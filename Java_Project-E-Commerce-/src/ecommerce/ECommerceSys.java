package ecommerce;

import java.util.ArrayList;

public class ECommerceSys {
	public static ArrayList<User> users = new ArrayList<User>();
	
	public static boolean searchUserID(int id) {//if exist return true
		for(User user : users) {
			if(user.getId()==id)
				return true;
		}
		return false;
	}
	
	
	public static boolean addProduct(Product product,Seller seller) {
		return seller.addToTheList(product);
	}
	public static boolean removeProduct(Product product,Seller seller) {
		return seller.removeFromTheList(product);
	}
	public static ArrayList<Product> searchProduct(String product_name) {
		ArrayList<Product> return_ArrayList = new ArrayList<Product>();
		for(User user : users) {
			if(user instanceof Seller) {
				Seller seller = (Seller) user;
				for(Product pro : seller.getProduct_list()) {
					if(pro.getName().matches(product_name)) {
						return_ArrayList.add(pro);
					}
				}
			}
		}
		return return_ArrayList;
	}
	
	public static String displayAllOrders() {
		
		String out = "\n All orders :\n------------\n";
		for(User user : users) {
			if(user instanceof Customer) {
				Customer customer = (Customer) user;
				out+= customer.displayOrders();
				
			}
		}
		return out;
	}
	
	//buy product bence su structure icin olmamis bastan baska bi sey dusunmemiz lazim 
	//denedim yazmadim
}
