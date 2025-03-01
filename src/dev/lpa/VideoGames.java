package dev.lpa;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class VideoGames extends Item {

    public VideoGames(String name, String type, String brand) {
        super(name, type, brand);
    }

    @Override
    public double itemPrice() {
        String name = itemName();
        if (name.equalsIgnoreCase("ELDEN RING")) {
            price = 59.99;
        }  else if (name.equalsIgnoreCase("VALORANT")) {
            price = 0.0;
        } else if (name.equalsIgnoreCase("FORTNITE")) {
            price = 29.99;
        } else if (name.equalsIgnoreCase("WARZONE")) {
            price = 59.99;
        } else if (name.equalsIgnoreCase("COUNTER-STRIKE 2")) {
            price = 19.99;
        }
        return price;
    }

    @Override
    public String itemName() {

        if (name.equalsIgnoreCase("E")) {
            name = "Elden Ring";
        } else if (name.equalsIgnoreCase("V")) {
            name = "VALORANT";
        } else if (name.equalsIgnoreCase("F")) {
            name = "Fortnite";
        } else if (name.equalsIgnoreCase("W")) {
            name = "Warzone";
        } else if (name.equalsIgnoreCase("C")) {
            name = "Counter-Strike 2";
        }
        return name;
    }

    @Override
    public String toString() {
        price = itemPrice();
        return ("-".repeat(120) + """
                    \n"NAME": "%s", "TYPE": "%s", "BRAND": "%s", \n -PRICE: $%.2f""".formatted(itemName(), type, brand, price) + "\n"
                + "-".repeat(120));
    }

    public static class VALORANTSkins {

        public static Random random = new Random();
        public static List<String> skinNames = List.of(java.lang.String.valueOf(skins.REAVER), java.lang.String.valueOf(skins.PRIME), java.lang.String.valueOf(skins.PRELUDE_TO_CHAOS), java.lang.String.valueOf(skins.ION),
                java.lang.String.valueOf(skins.SOVREIGN), java.lang.String.valueOf(skins.ARAXYS), java.lang.String.valueOf(skins.RGX), java.lang.String.valueOf(skins.CHAMPIONS));

        public static List<String> gunNames = List.of(java.lang.String.valueOf(Guns.VANDAL), java.lang.String.valueOf(Guns.KARAMBIT), java.lang.String.valueOf(Guns.BLADE),
                java.lang.String.valueOf(Guns.SHERRIF), java.lang.String.valueOf(Guns.BUTTERFLY), java.lang.String.valueOf(Guns.OPERATOR));

        public static String weapon1 = gunNames.get(random.nextInt(0, 5));
        public static String skinLine1 = skinNames.get(random.nextInt(0,7));
        public static String weapon2 = gunNames.get(random.nextInt(0, 5));
        public static String skinLine2 = skinNames.get(random.nextInt(0,7));
        public static String weapon3 = gunNames.get(random.nextInt(0, 5));
        public static String skinLine3 = skinNames.get(random.nextInt(0,7));
        public static String weapon4 = gunNames.get(random.nextInt(0, 5));
        public static  String skinLine4 = skinNames.get(random.nextInt(0,7));
        public static String skinLine5 = skinNames.get(random.nextInt(0,7));

        public static  double collectionPrice = getSkinLinePrice(skinLine1, "COLLECTION");
        public static  double price1 = getSkinLinePrice(skinLine2, weapon1);
        public static  double price2 = getSkinLinePrice(skinLine3, weapon2);
        public static double price3 = getSkinLinePrice(skinLine4, weapon3);
        public static  double price4 = getSkinLinePrice(skinLine5, weapon4);

        public static Date date = new Date();

        public static double newValue;

        public VALORANTSkins() {

        }

        public static void VALORANTStore() {
            System.out.println("-".repeat(120) + """
                                      
                                                            %s COLLECTION
                                                                    [IMAGE]
                                                                PRICE: $%.2f              
                    -----------------------------------OFFERS: %s-------------------------------------------------
                    %s %s              %s %s              %s %s              %s %s                                                        
                    [IMAGE]                    [IMAGE]                    [IMAGE]                     [IMAGE] 
                    PRICE: $%.2f               PRICE: $%.2f               PRICE: $%.2f                 PRICE: $%.2f
                    ------------------------------------------------------------------------------------------------------------------------
                    """.formatted(skinLine1, collectionPrice , date,
                    skinLine2, weapon1, skinLine3, weapon2, skinLine4, weapon3, skinLine5, weapon4,
                    price1, price2, price3, price4));
            System.out.println("ENTER 1, 2, 3, 4, or 5, to select one of the skin options:");

        }

        public static VideoGames ADDSkinsToCart(double skinOrderNumber) {

            newValue = skinOrderNumber;
            if (skinOrderNumber == 1) {
                VideoGames videoGames = new VideoGames(skinLine1, "COLLECTION", "VALORANT");
                videoGames.price = collectionPrice;
                return videoGames;
            } else if (skinOrderNumber == 2) {
                VideoGames videoGames = new VideoGames(skinLine2, weapon1, "VALORANT");
                videoGames.price = price1;
                return videoGames;
            } else if (skinOrderNumber == 3) {
                VideoGames videoGames = new VideoGames(skinLine3, weapon2, "VALORANT");
                videoGames.price = price2;
                return videoGames;
            } else if (skinOrderNumber == 4) {
                VideoGames videoGames = new VideoGames(skinLine4, weapon3, "VALORANT");
                videoGames.price = price3;
                return videoGames;
            } else if (skinOrderNumber == 5) {
                VideoGames videoGames = new VideoGames(skinLine5, weapon4, "VALORANT");
                videoGames.price = price4;
                return videoGames;
            }
            return new VideoGames("invalid", "invalid", "invalid");
        }

        private static double getSkinLinePrice(String skinLine, String weaponType) {

            double price = 0;
            for (int i = 0; i < skinNames.size(); i++) {

                if (skinLine.equalsIgnoreCase("REAVER") && !weaponType.equalsIgnoreCase("BLADE") &&
                !weaponType.equalsIgnoreCase("BUTTERFLY") && !weaponType.equalsIgnoreCase("KARAMBIT") && !weaponType.equalsIgnoreCase("COLLECTION")) {
                    price = 17.75;
                } else if (skinLine.equalsIgnoreCase("PRIME") && !weaponType.equalsIgnoreCase("BLADE") &&
                        !weaponType.equalsIgnoreCase("BUTTERFLY") && !weaponType.equalsIgnoreCase("KARAMBIT") && !weaponType.equalsIgnoreCase("COLLECTION")) {
                    price = 17.75;
                } else if (skinLine.equalsIgnoreCase("PRELUDE_TO_CHAOS") && !weaponType.equalsIgnoreCase("BLADE") &&
                        !weaponType.equalsIgnoreCase("BUTTERFLY") && !weaponType.equalsIgnoreCase("KARAMBIT") && !weaponType.equalsIgnoreCase("COLLECTION")) {
                    price = 21.75;
                } else if (skinLine.equalsIgnoreCase("ION") && !weaponType.equalsIgnoreCase("BLADE") &&
                        !weaponType.equalsIgnoreCase("BUTTERFLY") && !weaponType.equalsIgnoreCase("KARAMBIT") && !weaponType.equalsIgnoreCase("COLLECTION")) {
                    price = 17.75;
                } else if (skinLine.equalsIgnoreCase("ARAXYS") && !weaponType.equalsIgnoreCase("BLADE") &&
                        !weaponType.equalsIgnoreCase("BUTTERFLY") && !weaponType.equalsIgnoreCase("KARAMBIT") && !weaponType.equalsIgnoreCase("COLLECTION")) {
                    price = 21.75;
                } else if (skinLine.equalsIgnoreCase("RGX") && !weaponType.equalsIgnoreCase("BLADE") &&
                        !weaponType.equalsIgnoreCase("BUTTERFLY") && !weaponType.equalsIgnoreCase("KARAMBIT") && !weaponType.equalsIgnoreCase("COLLECTION")) {
                    price = 21.75;
                } else if (skinLine.equalsIgnoreCase("CHAMPIONS") && !weaponType.equalsIgnoreCase("BLADE") &&
                        !weaponType.equalsIgnoreCase("BUTTERFLY") && !weaponType.equalsIgnoreCase("KARAMBIT") && !weaponType.equalsIgnoreCase("COLLECTION")) {
                    price = 23.75;
                } else if (skinLine.equalsIgnoreCase("SOVREIGN") && !weaponType.equalsIgnoreCase("BLADE") &&
                        !weaponType.equalsIgnoreCase("BUTTERFLY") && !weaponType.equalsIgnoreCase("KARAMBIT") && !weaponType.equalsIgnoreCase("COLLECTION")) {
                    price = 17.75;
                } else if (weaponType.equalsIgnoreCase("BLADE") || weaponType.equalsIgnoreCase("BUTTERFLY") || weaponType.equalsIgnoreCase("KARAMBIT")) {
                    price = 43.50;
                } else {
                    if (skinLine.equalsIgnoreCase("REAVER") || skinLine.equalsIgnoreCase("PRIME") || skinLine.equalsIgnoreCase("SOVREIGN") ||
                    skinLine.equalsIgnoreCase("ION") && weaponType.equalsIgnoreCase("COLLECTION")) {
                        price = 71.00;
                    } else {
                        price = 87.00;
                    }
                }
            }
            return price;
        }
        enum skins {
            REAVER, PRIME, PRELUDE_TO_CHAOS, ION, SOVREIGN, ARAXYS, RGX, CHAMPIONS
        }

        enum Guns {
            VANDAL, KARAMBIT, BLADE, SHERRIF, BUTTERFLY, OPERATOR
        }

    }
}
