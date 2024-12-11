# Shopping Cart Project

This is a Java-based project that simulates a shopping cart system. The project demonstrates object-oriented programming concepts, including the use of classes, constructors, arrays, and methods. It also incorporates basic error handling and array operations.

## Project Description
The project consists of the following components:

1. **Product Class**:
   - Represents a product with attributes: `id`, `description`, `price`, and `quantity`.
   - Includes a constructor to initialize the attributes.
   - Provides a method `displayProductInfo()` to display product details.

2. **ShoppingCart Class**:
   - Manages a collection of products using an array with a fixed size of 5.
   - Includes methods to:
     - Add a product to the cart (`addProductToCart(Product product)`), ensuring valid input.
     - Calculate the total cost of products in the cart (`calculateTotalCost()`).
     - Display the contents of the cart (`displayCartContents()`).

3. **Main Class**:
   - Demonstrates the functionality of the `Product` and `ShoppingCart` classes.
   - Instantiates three products and adds them to the shopping cart.
   - Displays the cart contents and calculates the total cost.

## Features
- Add products to the shopping cart.
- Validate product price before adding.
- Display product details and cart contents.
- Calculate and display the total cost of the products in the cart.
- Handles scenarios like full cart and empty cart.
