package Shopping;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        // Instantiate 3 products
        Product product1 = new Product(1 , "mobile", 8784,9);
        Product product2 = new Product(2 , "TV", 1545.4,10);
        Product product3 = new Product(3 , "camera", 1333.84,3);




        // create class instance
        ShoppingCart shopping = new ShoppingCart();

        // adding 3 products to cart
        shopping.addProductToCart(product1);
        shopping.addProductToCart(product2);
        shopping.addProductToCart(product3);





        // method to display cart contents
        shopping.displayCartContents();

        // method th calculate total cost of the 3 products
        shopping.calculateTotalCost();




    }
    }
