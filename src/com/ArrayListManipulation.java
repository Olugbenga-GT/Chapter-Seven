package com;

import java.util.ArrayList;

public class ArrayListManipulation {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        items.add("Blue");
        items.add("Yellow");
        items.add(0, "Red");
        items.add("Magenta");
        items.add("Turquoise");

//        Display the array
        for(int i = 0; i < items.size(); i++){
            System.out.printf("  %s ", items.get(i));
        }

        display(items, "%n display list contents with enhanced for statements: ");
        items.add("green");
        items.add("Orangered");

        display(items , "%n New list of items:  ");
        System.out.println();
        System.out.println();

        System.out.printf("\"turquoise\" is %s in the list %n", items.contains("turquoise")? "" : "not");
    }

    public static void display(ArrayList<String> items, String header){
        System.out.printf(header);
        for(String item : items){
            System.out.printf("%s  ", item);
        }
    }
}
