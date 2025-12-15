package ecommerce;

public class OrderItem {
	
	
    private int product_id;
    private int quantity;
    
  


    public OrderItem(int product_id, int quantity) {
        this.product_id = product_id;
        this.quantity = quantity;
     
    }

    public int getProductID() {
        return product_id;
    }

    public int getQuantity() {
        return quantity;
    }
    

	@Override
	public String toString() 
	{
		return "\nProduct Id="+product_id+"quantity=" + quantity;
	}
    
    

}
