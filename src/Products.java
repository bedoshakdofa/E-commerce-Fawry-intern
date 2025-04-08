import java.util.Date;

public class Products {
    private int id;
    private String productName;
    private double price;
    private int ProductQuantity;
    Date expireDate;

    public double getWight() {
        return wight;
    }

    private double wight;
    private int PurchasedProduct;


    public Products(int id ,int productQuantity, String product_name, double price,Date expireDate,double wight) {

        this.ProductQuantity = productQuantity;
        this.productName = product_name;
        this.price = price;
        this.expireDate=expireDate;
        this.wight=wight;
        this.id=id;
    }

    public Products(int id,int productQuantity, String product_name, double price) {

        this(id,productQuantity,product_name,price,null,0);
    }

    public int getPurchasedProduct() {
        return PurchasedProduct;
    }

    public void setPurchasedProduct(int purchasedProduct) {
        PurchasedProduct = purchasedProduct;
    }

    public double getPrice() {
        return price;
    }


    public String getProductName() {
        return productName;
    }

    public int getId(){
        return id;
    }


    public int getProductQuantity() {
        return ProductQuantity;
    }

    public boolean checkProductQuantity(int amount){
        return amount<ProductQuantity;
    }

    public boolean isExpired(){
        if (expireDate==null)return false;
        else return new Date().after(expireDate);
    }

    public boolean isShippable(){
        return wight!=0;
    }

    public void reduceQuantity(){
        ProductQuantity-=PurchasedProduct;
    }
}
