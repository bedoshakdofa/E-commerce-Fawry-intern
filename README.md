<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>🛒 E-Commerce Application Assignment 🛒</h1>
    <p><strong>📋 Objective:</strong></p>
    <p>Develop a simple eCommerce application using Object-Oriented Programming (OOP) principles in Java. The application should allow users to manage his cart and do checkout with shipment </p>   
    <h2>🔧 Requirements:</h2>
    <h3>🏗️ Classes and Relationships:</h3>
    <ul>
        <li>
            <strong>🛍️ Product</strong>
            <ul>
                <li>Attributes: id, name, price, stockQuantity,expiredate, wight</li>
                <li>Methods: Constructors, getters, setters, isExpired(),isShippable(),ReduceQuantity(),checkProductQuantity()</li>
            </ul>
        </li>
        <li>
            <strong>👤 Customer</strong>
            <ul>
                <li>Attributes: id, name, email, address</li>
                <li>Methods: Constructors, getters, setters,withDrawBalance()</li>
            </ul>
        </li>
        <li>
            <strong>🛒 Cart</strong>
            <ul>
                <li>Attributes: productList (List of Product)</li>
                <li>Methods: Constructors, getters, setters, getTotalAmount(), AddProduct(), getAllProduct(),RemoveProduct(), RestCart()</li>
            </ul>
        </li>
        <li>
            <strong>📦 CheckoutService</strong>
            <ul>
                <li>Methods: CheckOut(),printReceipt()</li>
            </ul>
        </li>
    </ul>
    <h2>🚀 Main Application:</h2>
    <p>Create a Main class with a main method to interact with the user. Implement a simple text-based menu to perform the following actions:</p>
    <ul>
        <li>➕ Add a new product to cart</li>
        <li>❌ Remove a product from cart</li>
        <li>📃 View all products in cart</li>
        <li>🛒 Checkout</li>
        <li>📃 View all products in inventory</li>
    </ul>
    <h2>📂 Project function:</h2>
    <ul>
        <li>❌ project should rise error when adding expired product</li>
        <li>❌ project should rise error when adding out of stock product</li>
        <li>❌ project should rise error when Customer balance isn't enough</li>
    </ul>
</body>
</html>
