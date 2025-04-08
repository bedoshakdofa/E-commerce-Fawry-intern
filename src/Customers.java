public class Customers {

    private String Customer_Name;
    private Double Balance;

    public Customers(Double balance, String customerName) {
        Balance = balance;
        Customer_Name = customerName;
    }

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double balance) {
        Balance = balance;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public void  withDrawBalance(double amount){
        if (Balance<amount){
            throw new IllegalArgumentException("Inffcient Amount of balance");
        }else{
            Balance-=amount;
        }
    };
}
