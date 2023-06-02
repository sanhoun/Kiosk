package Dunkindonuts.Kiosk;

class Donut extends Kiosk {
    private double price;
    private String description;

    public Donut(String message, double price, String description) {
        super(message);
        this.price = price;
        this.description = description;
    }

    public Donut(String message) {
        super(message);
    }

    @Override
    public void displayMessage() {
        System.out.println(getMessage());
        System.out.println("[ DONUT MENU ]");
        System.out.println("1. Glazed Donut - " + price + "원 (" + description + ")");
        System.out.println("2. Chocolate Donut - " + price + "원 (" + description + ")");
        System.out.println("3. Strawberry Donut - " + price + "원 (" + description + ")");
        System.out.println("4. Blueberry Donut - " + price + "원 (" + description + ")");
        selectDonutType();
    }

    public void selectDonutType() {
        // Implementation for selecting donut type
    }
}