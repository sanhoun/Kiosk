package Dunkindonuts.Kiosk;

class Sandwiches extends Kiosk {
    private double price;
    private String description;

    public Sandwiches(String message, double price, String description) {
        super(message);
        this.price = price;
        this.description = description;
    }

    public Sandwiches(String message) {
        super(message);
    }

    @Override
    public void displayMessage() {
        System.out.println(getMessage());
        System.out.println("[ SANDWICHES MENU ]");
        System.out.println("1. Ham and Cheese Sandwich - " + price + "원 (" + description + ")");
        System.out.println("2. Turkey Club Sandwich - " + price + "원 (" + description + ")");
        System.out.println("3. BLT Sandwich - " + price + "원 (" + description + ")");
        System.out.println("4. Veggie Sandwich - " + price + "원 (" + description + ")");
    }

    public void selectSandwichesType() {
        // Implementation for selecting sandwich type
    }
}