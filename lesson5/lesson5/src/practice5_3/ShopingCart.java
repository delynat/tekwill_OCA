package practice5_3;

public class ShopingCart {
    public static void main(String[] args) {
        String custName="Marry Smith";
        String message;
        String[] items=new String[4];
        items[0]="Shirt";
        items[1]="Belt";
        items[2]="Scarf";
        items[3]="Skirt";
        message=custName+" want to purchase "+items.lenght+" .items";
System.out.println(message);
        System.out.println("Items purchased:");
        for(String item: items){
        System.out.println(item+",");}
    }
}