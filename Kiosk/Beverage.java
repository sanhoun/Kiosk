package Dunkindonuts.Kiosk;

import java.util.Scanner;

class Beverage extends Kiosk {
    private double price;
    private String description;

    public Beverage(String message, double price, String description) {
        super(message);
        this.price = price;
        this.description = description;
    }

    public Beverage(String message) {
        super(message);
    }

    @Override
    public void displayMessage() {
        System.out.println(getMessage());
        System.out.println("[ BEVERAGE MENU ]");
        System.out.println("1. 레몬에이드 - " + price + "원 (" + description + ")");
        System.out.println("2. 키위쿨라타 - " + price + "원 (" + description + ")");
        System.out.println("3. 아이스티 - " + price + "원 (" + description + ")");
        System.out.println("4. 라벤더에이드 - " + price + "원 (" + description + ")");
    }

    public void selectBeverageType() {
        // Implementation for selecting beverage type
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("레몬에이드를 선택하였습니다.");
                // 아메리카노에 대한 추가 동작 수행
                break;
            case 2:
                System.out.println("키위쿨라타를 선택하였습니다.");
                // 라떼에 대한 추가 동작 수행
                break;
            case 3:
                System.out.println("아이스티를 선택하였습니다.");
                // 에스프레소에 대한 추가 동작 수행
                break;
            case 4:
                System.out.println("라벤더에이드를 선택하였습니다.");
                // 카푸치노에 대한 추가 동작 수행
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }

        scanner.close();
    }
}