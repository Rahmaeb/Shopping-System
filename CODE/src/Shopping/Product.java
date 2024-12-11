package Shopping;

public class Product {


        //Product attributes
        public int id;
        public String description;
        public double price;
        public int quantity;


        // Constructor to initialize Product attributes
        public Product(int id, String description,double price , int quantity)
        {
         this.id=id;
         this.description=description;
         this.price=price;
         this.quantity=quantity;
        }

        // method to display product information
        public  void displayProductInfo()
        {
            System.out.println( "product id: " +id );
            System.out.println( " product description: " +description);
            System.out.println( "product price: " + price );
            System.out.println( "product quantity: " + quantity);
        }



    }

