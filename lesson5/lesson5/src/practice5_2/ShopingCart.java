package practice5_2;

public class ShopingCart {
    public static void main(String[] args) {
String custName="Marry Smith";
String message;
String[] items={"Shirt","Socks","Scarf","Belt"};
message=custName+"want to purchace "+ items.length+" items";
System.out.println(message);
       System.out.println(items[2]);
       // System.out.println(items[4]);
        System.out.println(items[items.length-1]);
    }
}
