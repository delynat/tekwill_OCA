public class Item{

    public int ID;
    public String descr;
    public double price;
    public int quantity;

    public static void main(String[] args) {
        Item item1,item2;
        item1=new Item();
        item2=new Item();
        item1.descr="Shirt";
        item2.descr="Belt";
        System.out.println(item1.descr);
        System.out.println(item2.descr);

    }
}

