package dev.lpa;

public class PcPart extends Item {

    public PcPart(String name, String type, String brand) {
        super(name, type, brand);
    }

    @Override
    public double itemPrice() {

        String name = itemName();

        if (name.equalsIgnoreCase("I5 14600K")) {
            price = 149.99;
        } else if (name.equalsIgnoreCase("I7 14700K")) {
            price = 339.99;
        } else if (name.equalsIgnoreCase("I9 14900K")) {
            price = 499.99;
        } else if (name.equalsIgnoreCase("CPU COOLER")) {
            price = 49.99;
        } else if (name.equalsIgnoreCase("MOTHERBOARD")) {
            price = 149.99;
        } else if (name.equalsIgnoreCase("RAM")) {
            price = 99.99;
        } else if (name.equalsIgnoreCase("SSD")) {
            price = 99.99;
        } else if (name.equalsIgnoreCase("4060")) {
            price = 299.99;
        } else if (name.equalsIgnoreCase("4070")) {
            price = 549.99;
        } else if (name.equalsIgnoreCase("4080")) {
            price = 949.99;
        } else if (name.equalsIgnoreCase("PC CASE")) {
            price = 89.99;
        } else if (name.equalsIgnoreCase("POWER SUPPLY")) {
            price = 99.99;
        }
        return price;
    }

    @Override
    public String itemName() {

        if (name.equalsIgnoreCase("I5")) {
            name = "i5 14600k";
        } else if (name.equalsIgnoreCase("I7")) {
            name = "i7 14700k";
        } else if (name.equalsIgnoreCase("I9")) {
            name = "i9 14900k";
        } else if (name.equalsIgnoreCase("C")) {
            name = "CPU COOLER";
        } else if (name.equalsIgnoreCase("MB")) {
            name = "MOTHERBOARD";
        } else if (name.equalsIgnoreCase("RAM")) {
            name = "RAM";
        } else if (name.equalsIgnoreCase("SSD")) {
            name = "SSD";
        } else if (name.equalsIgnoreCase("4060")) {
            name = "4060";
        } else if (name.equalsIgnoreCase("4070")) {
            name = "4070";
        } else if (name.equalsIgnoreCase("4080")) {
            name = "4080";
        } else if (name.equalsIgnoreCase("CASE")) {
            name = "PC CASE";
        } else if (name.equalsIgnoreCase("PSU")) {
            name = "POWER SUPPLY";
        }
        return name;
    }

    @Override
    public String toString() {
        price = itemPrice() + (brandMultiplier() * itemPrice());
            return ("-".repeat(120) + """
                    \n"NAME": "%s", "TYPE": "%s", "BRAND": "%s", \n -PRICE: $%.2f""".formatted(itemName(), type, brand, price) + "\n"
                    + "-".repeat(120));

    }
}

