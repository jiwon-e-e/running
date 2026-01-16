package spartaclub.spartaclub.running.day01.step4;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1일차 Step 4: 인터페이스와 다형성 (Polymorphism) ===");

        Customer customer = new Customer();

//        // 상황 1: 오전에는 사람이 알바를 함
//        System.out.println("\n[1] 오전반: 사람 바리스타 근무");
//        CoffeeMaker human = new Barista();
//        Cashier morningCashier = new Cashier(human); // 다형성: Barista -> CoffeeMaker
//
//        customer.order("아이스 아메리카노", morningCashier);
//
//
//        // 상황 2: 오후에는 최신형 로봇이 근무
//        System.out.println("\n[2] 오후반: 로봇 바리스타 근무");
//        CoffeeMaker robot = new RobotBarista();
//        Cashier afternoonCashier = new Cashier(robot); // 다형성: RobotBarista -> CoffeeMaker
//
//        // 중요: 손님이나 캐셔 코드는 하나도 바뀌지 않았는데,
//        // 바리스타가 바뀌니까 커피 만드는 방식(로그)이 바뀜! -> 다형성의 매력
//        customer.order("따뜻한 라떼", afternoonCashier);
//
//        // 상황 3: 야간에는 고얌이가 근무
//        System.out.println("\n[3] 야간반: 냥 바리스타 근무");
//        CoffeeMaker tako = new catBarista();
//        Cashier nightCashier = new Cashier(tako); // 다형성: RobotBarista -> CoffeeMaker
//
//        // 중요: 손님이나 캐셔 코드는 하나도 바뀌지 않았는데,
//        // 바리스타가 바뀌니까 커피 만드는 방식(로그)이 바뀜! -> 다형성의 매력
//        customer.order("냥푸치노", nightCashier);

        // 상황 1: 오전에는 사람 알바
        System.out.println("\n[1] 오전반: 사람 바리스타 근무");
        CoffeeMaker human = new Barista();
        Cashier morningCashier = new Cashier(human); // 다형성: Barista -> CoffeeMaker

        customer.order("아이스 아메리카노", morningCashier);

        System.out.println("\n[2] 오후반: 냥 바리스타 근무");
        CoffeeMaker tako = new catBarista();
        Cashier nightCashier = new Cashier(tako);
        customer.order("냥푸치노", nightCashier);

    }
}