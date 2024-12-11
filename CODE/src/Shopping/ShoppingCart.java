package Shopping;

public class ShoppingCart {


    //array store 5 Product objects
    Product [] cartItems = new Product[5];
    int itemCount=0;  // track no. products in the cart
    int i=1;



    // method to add product to the cart
    public void addProductToCart(Product product) {
        if (product.price <= 0) {
            System.out.println();
            System.out.println("please enter valid price greater than zero, product not added");
            System.out.println();
        }

        else
        {
            if (itemCount < cartItems.length)
            {
                cartItems[itemCount] = product;
                itemCount++;
                System.out.println();
                System.out.println("success adding! the name of the product added is " + product.description);
                System.out.println("item counter is : " +itemCount);
                System.out.println();
            }
            else
            {
                System.out.println("sorry,the cart is full ");
                System.out.println();
            }
        }
    }


    // method to calculate total cost of the products
    public void calculateTotalCost()
    {
        double totalcost=0.0;

        for (int i=0; i<itemCount; i++)
        {
            totalcost = totalcost + cartItems[i].price*cartItems[i].quantity;
        }

        System.out.println(" the total cost of the items $ " +totalcost);
        System.out.println();
    }



    // method to display cart contents
    public void displayCartContents()
    {
        if (itemCount==0)
        {
            System.out.println("the cart is empty");
        }

        System.out.println("cart items :");

        for (int i = 0; i < itemCount; i++) {
            cartItems[i].displayProductInfo();
            System.out.println();
        }
    }
}