/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_07_2;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        String lastName;
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
        lastName=custName.substring(spaceIdx+1);
        System.out.println(lastName);
        System.out.println(firstName+" "+lastName);
        
        //Instantiate and initialize sb to firstName.
        StringBuilder sb=new StringBuilder(firstName);

	// Put the full name back together, using StringBuilder append method.
        sb.append(" ").append("Smith");
        System.out.println(sb);

	// You can just enter the String literal for the last name.
	// Print the full name.
        
	
	// (Optional) Can you append the last name without using a String literal?

        
    }
}