package Dunkindonuts.Kiosk;

import java.util.Scanner;

class Coffee extends Kiosk {
    private double price;
    private String description;


    

    public Coffee(String message, double price, String description) {
        super(message);
        this.price = price;
        this.description = description;
    }

    public Coffee(String message) {
        super("커피를 선택하였습니다.");
    }

//    public int menu_coffee(Scanner sc) {
//
//    };

    @Override
    public void displayMessage() {
        System.out.println(getMessage());
        System.out.println("[ COFFEE MENU ]");
        System.out.println("1. 아메리카노 - " + price + "원 (" + description + ")");
        System.out.println("2. 라떼 - " + price + "원 (" + description + ")");
        System.out.println("3. 에스프레소 - " + price + "원 (" + description + ")");
        System.out.println("4. 카푸치노 - " + price + "원 (" + description + ")");
        selectCoffeeType();

    }
//    public void displayMessage() {
//System.out.println(getMessage());


//    }


    public void selectCoffeeType() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("아메리카노를 선택하였습니다.");
                // 아메리카노에 대한 추가 동작 수행
                break;
            case 2:
                System.out.println("라떼를 선택하였습니다.");
                // 라떼에 대한 추가 동작 수행
                break;
            case 3:
                System.out.println("에스프레소를 선택하였습니다.");
                // 에스프레소에 대한 추가 동작 수행
                break;
            case 4:
                System.out.println("카푸치노를 선택하였습니다.");
                // 카푸치노에 대한 추가 동작 수행
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }

        scanner.close();
    }


}
