package Dunkindonuts.Kiosk;

abstract class Kiosk {
    protected String message;

    public Kiosk(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public abstract void displayMessage();

    public void processOrder() {
        System.out.println("주문을 처리합니다.");
    }

    public void cancelOrder() {
        System.out.println("주문을 취소합니다.");
    }
}
