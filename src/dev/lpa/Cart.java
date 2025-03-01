package dev.lpa;

import java.util.ArrayList;

public class Cart<T extends Item> {

    ArrayList<T> list = new ArrayList<>();
    public void addItem(T t) {
        list.add(t);
        System.out.println("-".repeat(80));
        System.out.println("ITEM ADDED TO CART");
        System.out.println("-".repeat(80));
    }
    public void removeItem(String name) {

        int size = name.length();
        String type = null;

        if (name.equals("1")) {
            name = VideoGames.VALORANTSkins.skinLine1;
            type = "Collection";

        }
        if (name.equals("2")) {
            name = VideoGames.VALORANTSkins.skinLine2;
            type = VideoGames.VALORANTSkins.weapon1;
        }
        if (name.equals("3")) {
            name = VideoGames.VALORANTSkins.skinLine3;
            type = VideoGames.VALORANTSkins.weapon2;
        }
        if (name.equals("4")) {
            name = VideoGames.VALORANTSkins.skinLine4;
            type = VideoGames.VALORANTSkins.weapon3;
        }
        if (name.equals("5")) {
            name = VideoGames.VALORANTSkins.skinLine5;
            type = VideoGames.VALORANTSkins.weapon4;
        }

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).name.substring(0, size).equalsIgnoreCase(name) && type == null) {
                list.remove(list.get(i));

            } else if (list.get(i).name.equalsIgnoreCase(name) && type != null) {
                list.remove(list.get(i));
            }
        }

        System.out.println("-".repeat(80));
        System.out.println("ITEM REMOVED FROM CART");
        System.out.println("-".repeat(80));
    }

    public void calculateTotal() {

        double total = 0;
        for (T t : list) {
            System.out.printf("+ $%.2f\n", t.price);
            total+= t.price;
        }
        System.out.println("-".repeat(120));
        System.out.println("TOTAL:");
        System.out.printf("$%.2f\n", total);
        System.out.println("-".repeat(120));

    }

    public void printList() {

        System.out.println("CART:");
        for (T e : list) {
            System.out.println(e);
        }
    }
}
