    import java.util.ArrayList;
    import java.util.Date;
    import java.util.List;
    import java.util.Scanner;

    public class Main {
        static List<Products> prod=new ArrayList<>();

        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);

            long week = 7L * 24 * 60 * 60 * 1000; // 1 week in ms
            long twoWeeks = 2 * week;
            long month = 4 * week;
            prod.add(new Products(1,20, "Cheese", 200, new Date(System.currentTimeMillis() -week), 2));
            prod.add(new Products(2,10, "Milk", 100, new Date(System.currentTimeMillis() + twoWeeks), 2));
            prod.add(new Products(3,25, "Frozen Pizza", 120, new Date(System.currentTimeMillis() + month), 1.75));
            prod.add(new Products(4,8, "TV", 3000, null, 5.6));
            prod.add(new Products(5,5, "Laptop", 5000, null, 9.5));
            prod.add(new Products(6,6, "Air Conditioner", 4000, null, 20));
            prod.add(new Products(7,15, "Smartwatch", 800, null, 0.6));
            prod.add(new Products(8,30, "In-Store Coupon", 0, null, 0));
            prod.add(new Products(9,100, "Service Package", 150, null, 0));
            prod.add(new Products(10,60, "Membership Card", 50, null, 0));


            System.out.println("Hi Welcome, please enter your name ");
            String username=in.next();
            System.out.println("please enter you balance");
            double balance=in.nextDouble();
            Customers customer=new Customers(balance,username);
            Cart cart=new Cart();
            CheckoutService checkout =new CheckoutService();

            int choice=0;
            do{
                System.out.println("choose you action");
                System.out.println("1. Add product to cart");
                System.out.println("2. Remove product from cart");
                System.out.println("3. GetAll product from cart");
                System.out.println("4. Checkout and payment");
                System.out.println("5. view all product");
                System.out.println("0. exit");
                choice=in.nextInt();
                switch (choice) {
                    case 1:
                        addProductToCart(in,cart);
                        break;
                    case 2:
                        removeProductFromCart(in,cart);
                        break;
                    case 3:
                        getProductsFromCart(cart);
                        break;
                    case 4:
                        checkout.checkOut(customer,cart);
                        break;
                    case 5:
                        getAllProductInventory();
                        break;
                    case 0:
                        System.out.println("Bye👋");
                        break;
                    default:
                        System.out.println("invalid input enter valid input");
                }

            }while (choice != 0);
            in.close();
        }

        private static void addProductToCart(Scanner scanner, Cart cart){
            System.out.println("please enter the number of your item");
            int itemNum=scanner.nextInt();
            System.out.println("please enter you quantity");
            int quantityNum=scanner.nextInt();
            for(Products item:prod){
              if (item.getId()==itemNum){
                  cart.addProduct(item,quantityNum);
                  break;
              }
            };
        }

        private static void removeProductFromCart(Scanner scanner,Cart cart){
            System.out.println("please enter the number of your item in the cart");
            int itemNum=scanner.nextInt();
            for(Products item:prod){
                if (item.getId()==itemNum){
                    cart.removeProduct(item.getId());
                    break;
                }
            };
        }
        private static void getAllProductInventory(){
            for(Products item:prod){
                System.out.println(item.getId()+" "
                        +item.getProduct_name()+" quantity==>"
                        +item.getProductQuantity()+" Price==>"
                        +item.getPrice());
            }
            System.out.println("=============================================");
        }

        private static void getProductsFromCart(Cart cart){
            List<Products> List=cart.getAllProduct();
            for(Products item:List){
                System.out.println(item.getId()+" "
                        +item.getProduct_name()+" quantity==>"
                        +item.getProductQuantity()+" Price==>"
                        +item.getPrice());
            }

            System.out.println("===================================");
        }

    }
