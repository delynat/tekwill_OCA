/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_06_2;

public class Item {
        public int itemID;
        public String desc;
        public double price;
        public int quantity;


        public static void main(String[] args) {
                Item item1,item2;
                item1=new Item();
                item2=new Item();

                item1.desc="Shirt";
                item2.desc="Belt";
                System.out.println(item1.desc);
                System.out.println(item2.desc);
        }

}
