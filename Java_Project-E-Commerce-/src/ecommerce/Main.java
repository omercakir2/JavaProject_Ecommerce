package ecommerce;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("### STARTING E-COMMERCE SYSTEM TEST ###\n");

        // ---------------------------------------------------------
        // 1. Create Users (Sellers and Customer)
        // ---------------------------------------------------------
        Seller techSeller = new Seller("TechWorld", "pass123");
        Seller fashionSeller = new Seller("FashionHub", "secretPass");
        Customer customer = new Customer("John Doe", "1234", "101 Main St, Ankara");

        // Add them to the system
        ECommerceSys.addUser(techSeller);
        ECommerceSys.addUser(fashionSeller);
        ECommerceSys.addUser(customer);

        System.out.println("Users created: " + ECommerceSys.users.size());

        Product iPhone = new TechProduct(
            techSeller.getId(), "iPhone 15 Pro", 60000.0, 50, "Apple", 4.9, 
            "phone", 2024, true
        );

        // Clothing Product (Tax: 20%, Weight: 150g fixed)
        Product tShirt = new ClothingProduct(
            fashionSeller.getId(), "Summer Tee", 500.0, 100, "Mavi", 4.5, 
            "t-shirt", "Unisex", "Cotton", "Summer", "White"
        );

        // Market Product (Food Tax: 0%, Weight: 200g)
        Product chips = new MarketProduct(
            techSeller.getId(), "Lays Classic", 50.0, 200, "Lays", 4.2, 
            "food", "2025-01-01"
        );

        // Add products to the system
        ECommerceSys.addProduct(iPhone);
        ECommerceSys.addProduct(tShirt);
        ECommerceSys.addProduct(chips);

        System.out.println("\n--- LIST OF ALL PRODUCTS ---");
        System.out.println(ECommerceSys.displayAllProducts());


        Order myOrder = new Order(customer.getId());


        OrderItem item1 = new OrderItem(iPhone.getId(), 1);
        OrderItem item2 = new OrderItem(tShirt.getId(), 2);
        OrderItem item3 = new OrderItem(chips.getId(), 10);

        // Add items to the order
        ECommerceSys.addToOrder(item1, myOrder);
        ECommerceSys.addToOrder(item2, myOrder);
        ECommerceSys.addToOrder(item3, myOrder);
        
        // Register the order in the system
        ECommerceSys.orders.add(myOrder);


       
        System.out.println("\n--- FINAL ORDER RECEIPT ---");
        System.out.println(myOrder.toString());

        System.out.println("\n--- FINAL LIST OF ALL PRODUCTS  ---");
        System.out.println(ECommerceSys.displayAllProducts());

    }
}