public class CheckoutService {
    private static final double SHIPPING_RATE_PER_KG = 5.0;

    public void checkOut(Customers customer, Cart cart){

 
        if (cart.getAllProduct().isEmpty()) throw new IllegalArgumentException("the cart is empty");

        double subtotal=cart.getTotalAmount();
        double totalShip=0;
        for(Products Item: cart.getAllProduct()){
            if (Item.isShippable()){
                totalShip+=(Item.getWight()*Item.getPurchasedProduct());
            }
        }

        customer.withDrawBalance((subtotal+totalShip));

  
        for(Products Item: cart.getAllProduct()){
            Item.reduceQuantity();
        }

        printReceipt(cart,subtotal,totalShip,customer);
        cart.restCart();
    }
    private static void printReceipt(Cart cart, double subtotal, double shipping, Customers customer) {
        System.out.println("** Shipment notice**");
        for(Products Item: cart.getAllProduct()){
            if(!Item.isShippable()) continue;
            System.out.println(Item.getPurchasedProduct()+"X  "+Item.getProductName()+"  = "+Item.getWight() * Item.getPurchasedProduct()+"g");
        }
        System.out.println("Total Amount Package = "+shipping);
        System.out.println("===================================");
        System.out.println("** Checkout receipt **");
        for(Products Item: cart.getAllProduct()){
            System.out.println(Item.getPurchasedProduct()+"X  "+Item.getProductName()+"  = "+Item.getPrice() * Item.getPurchasedProduct()+" Egb");
        }
        System.out.println("================================");
        System.out.println("Subtotal "+ subtotal);
        System.out.println("Shipping "+shipping*SHIPPING_RATE_PER_KG);
        System.out.println("Amount "+(subtotal+(shipping*SHIPPING_RATE_PER_KG)));
        System.out.println("Remaining balance: "+customer.getBalance());
        System.out.println("==============================");
    }
}
