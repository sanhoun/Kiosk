package Dunkindonuts.Kiosk;

import java.util.Scanner;

public class Menu {
    public static void Menu(String[] args) {
        System.out.println("[ DUNK MENU ]");
        System.out.println("1. 커피 | 국내에서 직접 로스팅하여 더욱신선한 커피");
        System.out.println("2. 음료 | 도넛과 잘어울리는 음료");
        System.out.println("3. 도넛 | 커피와 잘어울리는 도넛");
        System.out.println("4. 샌드위치 | 아침을 여는 든든한 샌드위치");
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. 장바구니 | 장바구니를 확인 후 주문하기");
        System.out.println("6. 주문취소 | 주문을 취소하고 장바구니를 비웁니다.");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Coffee coffee = new Coffee("커피를 선택하였습니다.");
                coffee.displayMessage();
                if (choice == 1) {
//                    cart(donutsMenu1);
                    System.out.println("장바구니에 추가되었습니다.");
                    System.out.println();
                }else if(choice == 2){
                    System.out.println("진행하던 주문이 취소되었습니다.");
                    System.out.println();

                }
                // 커피 종류에 따른 추가 동작 수행
                break;
            case 2:
                Beverage beverage = new Beverage("음료를 선택하였습니다.");
                beverage.selectBeverageType();
                // 음료 종류에 따른 추가 동작 수행
                break;
            case 3:
                Donut donut = new Donut("도넛을 선택하였습니다.");
                donut.selectDonutType();
                // 도넛 종류에 따른 추가 동작 수행
                break;
            case 4:
                Sandwiches sandwiches = new Sandwiches("샌드위치를 선택하였습니다.");
                sandwiches.selectSandwichesType();
                // 샌드위치 종류에 따른 추가 동작 수행
                break;
            case 5:
                // 주문 처리
                break;
            case 6:
                // 주문 취소
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                break;
        }
    }

}
