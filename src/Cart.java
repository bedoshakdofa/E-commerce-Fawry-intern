import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Products>productList;

    public Cart(){
        this.productList=new ArrayList<>();
    }

    public double getTotalAmount(){
        double sum=0;
      for(Products prod:productList){
       sum+=prod.getPurchasedProduct()* prod.getPrice();
      }
      return sum;
    };

    public void addProduct(Products prod, int Quantity){
        if (!prod.checkProductQuantity(Quantity)){
            throw new IllegalArgumentException("there isn't enough in stoke");
        };
        if (prod.isExpired()) throw new IllegalArgumentException("this product is expired");

        prod.setPurchasedProduct(Quantity);
        productList.add(prod);
    }

    public List<Products> getAllProduct(){
        if (productList.isEmpty()){
            System.out.println("the cart is empty");
        }
        return productList;
    };

    public void removeProduct(int id){
        for(Products Item:productList) {
            if (Item.getId() == id){
                productList.remove(Item);
                break;
            }

        }
    }
    public void restCart(){
        productList.clear();
        }
}

