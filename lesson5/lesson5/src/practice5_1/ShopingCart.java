package practice5_1;

public class ShopingCart {
    public static void main(String[] args) {
        String custName="Mary Smith";
        String itemDesc="Shirt";
        String message;
        double price=29.99;
        int quantity=2;
        double tax=1.04;
        double total;

       //Mary Smith wants to purcase 2 Shirts
        message=custName+"wants to purcase"+quantity+""+itemDesc;
        total=quantity*price*tax;
        if (quantity>1){
           message=message+"s";
                    }
                    boolean outofStock=false;
        if (outofStock){
          System.out.println(itemDesc+"is out of stock.");
                    }
                    else {
            System.out.println(message);
            System.out.println("Total cost with tax:"+total);
            System.out.println("Total cost with tax:"+quantity*price*tax);
        }
    }
}


