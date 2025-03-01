package dev.lpa;

public class PreBuiltPcs extends Item {

    public PreBuiltPcs(String name, String type, String brand) {
        super(name, type, brand);
    }

    @Override
    public double itemPrice() {

        String name1 = itemName();
        if (name1.equalsIgnoreCase("BASIC")) {
            price = 800.00;
        } else if (name1.equalsIgnoreCase("INTERMEDIATE")) {
            price = 1000.00;
        } else if (name1.equalsIgnoreCase("ADVANCED")) {
            price = 1200.00;
        } else if (name1.equalsIgnoreCase("PRO")) {
            price = 2000.00;
        }
        return price;
    }

    @Override
    public String itemName() {

        if (name.equalsIgnoreCase("B")) {
            name = "BASIC";
        } else if (name.equalsIgnoreCase("I")) {
            name = "INTERMEDIATE";
        } else if (name.equalsIgnoreCase("A")) {
            name = "ADVANCED";
        } else if (name.equalsIgnoreCase("P")) {
            name = "PRO";
        }
        return name;
    }

    public String toString() {
        price = itemPrice() + (brandMultiplier() * itemPrice());
        return ( "-".repeat(120) + """
                \n"NAME": "%s", "TYPE": "%s", "BRAND": "%s", \n -PRICE: $%.2f""".formatted(itemName(), type, brand, price) + "\n"
        + "-".repeat(120));
    }
}
