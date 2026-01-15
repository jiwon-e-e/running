package spartaclub.spartaclub.running.day01.step6;

// ⭕ GOOD Code: 주문을 받아서 바리스타에게 전달하는 역할 (Manager)
public class Cashier {
    // 핵심! 구체적인 Barista 클래스가 아니라, 인터페이스에 의존함.
    // 이제 이 자리에 사람(Barista)이 오든 로봇(RobotBarista)이 오든 상관없음. (다형성)
    private CoffeeMaker coffeeMaker;

    public Cashier(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public Coffee takeOrder(String menuName) {
        System.out.println("💰 캐셔: " + menuName + " 주문 받았습니다.");
        // 인터페이스의 메서드를 호출 (실제 실행되는 코드는 구현체에 따라 다름)
        Menu enumMenu = Menu.findMenuName(menuName);

        return coffeeMaker.makeCoffee(enumMenu);
    }
}