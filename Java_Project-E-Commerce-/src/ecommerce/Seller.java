package ecommerce;

import java.util.ArrayList;

public class Seller extends User{
	
	private ArrayList<Product> product_list = new ArrayList<Product>();

	public Seller(int id, String username, String password) {
		super(id, username, password);
	}

	public ArrayList<Product> getProduct_list() {
		return product_list;
	}

	public void setProduct_list(ArrayList<Product> product_list) {
		this.product_list = product_list;
	}
	public String displayProducts() {
		String out = "\nProduct list of [" + this.getId() +"]\n";
		for(Product product : product_list) {
			out += product.toString();	
		}
		return out;
	}
	public boolean addToTheList(Product product) {
		if(product==null) {
			return false;
		}
		this.product_list.add(product);
		return true;
	}
	public boolean removeFromTheList(Product product) {
		if(product==null)return false;
		return this.product_list.remove(product);
	}
	public Product searchProduct(int id) {
		for(Product product : product_list) {
			if(product.getId()==id)
				return product;
		}
		return null;
	}
	public String toString() {
		return "Seller"+super.toString()+displayProducts();
	}
	

}

