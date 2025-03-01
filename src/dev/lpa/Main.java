package dev.lpa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> inputList = new ArrayList<>();

        Cart<Item> cart = new Cart<>();

        String input;

        while(true) {
            System.out.println("-".repeat(120) + """
                            \nPRESS Q TO QUIT!
                    Welcome to Aarav's electronics online store. We sell, pc parts
                    prebuilt pcs, video games, and pc equipment:
                    Enter a number for an action below:
                        (1) Prebuilt pcs
                        (2) Pc parts
                        (3) Video games""");


            input = sc.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            switch (input) {
                case "1":
                    while (true) {
                        System.out.println("-".repeat(120) + """
                                \nPre-built Pc options(NOTE: prices may vary based on brand):
                                    (B)BASIC - $800, specs: i5 14600k, 3060
                                    (I)INTERMEDIATE - $1000, specs: i5 14600k 4060 ti
                                    (A)Advanced - $1200, specs : i7 14700k, 4070
                                    (P)PRO - $2000, specs: i9  14900k, 4080
                                    (Q) to QUIT!""");
                        String name = sc.nextLine();

                        if (name.equalsIgnoreCase("Q")) {
                            break;
                        }
                        inputList.add(name);
                        System.out.println("-".repeat(120) + """
                                \nPick a Brand(each brand has a different price!):
                                    (ALIENWARE)
                                    (ASUS)
                                    (ACER)
                                    (GIGABYTE)""");
                        String brand = sc.nextLine();
                        PreBuiltPcs preBuiltPcs = new PreBuiltPcs(name, "PRE-BUILT PC", brand);
                        cart.addItem(preBuiltPcs);
                    }
                    break;
                case "2":
                    while (true) {
                        System.out.println("""
                                PC PARTS(NOTE: prices vary based on brand):
                                    (i5)CPU - $149.99, INTEL i5 14600k
                                    (i7)CPU - $339.99, INTEL i7 14700k
                                    (i9)CPU - $499.99, INTEL i9 14900k
                                    (C)COOLER - $49.99, CPU COOLER
                                    (MB)MOTHERBOARD - $149.99, INTEL 14th gen compatible motherboard
                                    (RAM)RAM - $99.99, 32 GB RAM
                                    (SSD)SSD - $99.99, 1tb SSD
                                    (4060)GPU - $299.99, NVIDIA 4000 series 4060
                                    (4070)GPU - $549.99, NVIDIA 4000 series 4070
                                    (4080)GPU - $949.99, NVIDIA 4000 series 4080
                                    (CASE)CASE - $89.99, PC CASE
                                    (PSU)PSU - $99.99, POWER SUPPLY 850W
                                    (Q) TO QUIT!""");
                        String pcPartName = sc.nextLine();

                        if (pcPartName.equalsIgnoreCase("Q")) {
                            break;
                        }
                        if (pcPartName.equalsIgnoreCase("I5") || pcPartName.equalsIgnoreCase("I7") || pcPartName.equalsIgnoreCase("I9")) {
                            inputList.add(pcPartName);
                            PcPart pcPart = new PcPart(pcPartName, "PC-PART", "INTEL");
                            cart.addItem(pcPart);
                        } else if (pcPartName.equalsIgnoreCase("4060") || pcPartName.equalsIgnoreCase("4070") || pcPartName.equalsIgnoreCase("4080")) {
                            inputList.add(pcPartName);
                            PcPart pcPart = new PcPart(pcPartName, "PC-PART", "NVIDIA");
                            cart.addItem(pcPart);
                        } else {
                            inputList.add(pcPartName);
                            System.out.println("-".repeat(120) + """
                                    \nPick a Brand(each brand has a different price!):
                                        (ALIENWARE)
                                        (ASUS)
                                        (ACER)
                                        (GIGABYTE)""");
                            String pcPartBrand = sc.nextLine();
                            PcPart pcPart = new PcPart(pcPartName, "PC-PART", pcPartBrand);
                            cart.addItem(pcPart);
                        }
                    }
                    break;
                case "3":
                    while (true) {
                        System.out.println("-".repeat(120) + """
                                \nVideo Game options:
                                    (E) Elden Ring - $59.99
                                    (V) VALORANT - $0, (skins available)
                                    (F) Fortnite - $29.99
                                    (W) Warzone - $59.99
                                    (C) Counter Strike 2 - $19.99
                                    (Q) TO QUIT!""");
                        String name = sc.nextLine();
                        if (name.equalsIgnoreCase("Q")) {
                            break;
                        }
                        if (name.equalsIgnoreCase("V")) {
                            //valorant skins
                            VideoGames.VALORANTSkins.VALORANTStore();
                            double skinOrderNumber = sc.nextDouble();
                            String number = String.valueOf(skinOrderNumber);
                            cart.addItem(VideoGames.VALORANTSkins.ADDSkinsToCart(skinOrderNumber));
                            inputList.add(number);
                        } else if (name.equalsIgnoreCase("E") || name.equalsIgnoreCase("F") || name.equalsIgnoreCase("W") ||
                        name.equalsIgnoreCase("C")) {
                            inputList.add(name);
                            VideoGames videoGames = new VideoGames(name, "VIDEO_GAME", "AARAV_BAN-GAMES");
                            cart.addItem(videoGames);
                        }
                    }
                    break;
            }
        }
        System.out.println("-".repeat(120));
        cart.printList();
        cart.calculateTotal();

        //remove items option here.

        while (true) {
            System.out.println("-".repeat(120) + """
                    \nNow if you want to remove any items:
                    (M) To see all item input names
                    (Q) to break!
                    Enter item input name that you want to remove:""");

            String itemToRemove = sc.nextLine();
            if (itemToRemove.equalsIgnoreCase("Q")) {
                break;
            }

            if (itemToRemove.equalsIgnoreCase("M")) {
                for (String s : inputList) {
                    System.out.println("-".repeat(120));
                    System.out.println("(" + s.toUpperCase() + ")");
                }
                System.out.println("-".repeat(120));
            } else {
                cart.removeItem(itemToRemove);
            }
        }
        System.out.println("-".repeat(120));
        System.out.println("AFTER REMOVAL");
        cart.printList();
        cart.calculateTotal();
    }
}
