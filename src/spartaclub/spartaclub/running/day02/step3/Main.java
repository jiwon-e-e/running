package spartaclub.spartaclub.running.day02.step3;

public class Main {
    public static void main(String[] args) {
        //익명클래스 사용 

        //햄버거 셰프 고용
        HamburgerChef burgerKing = new HamburgerChef();

        // 어떤 손님이 와서 지옥버거 주문
        BurgerRecipe hellRecipe = () -> System.out.println("# 지옥에서 만든 보라색 소스 준비");

        burgerKing.setRecipe(hellRecipe);
        burgerKing.makeBurger();

        burgerKing.setRecipe(
                () -> {
                    System.out.println("# 양상추 3장 ");
                    System.out.println("# 아보카도 듬뿍~");
                }
        );
        burgerKing.makeBurger();

        System.out.println("================");

        //덧셈 하고싶어요

        Calculator addOperation = new AddOperation();
        int addRet = addOperation.operate(20, 30);
        System.out.println("addResult = " + addRet);


        Calculator subOperation = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 - n2;
            }
        };
        int subRet = subOperation.operate(40, 15);
        System.out.println("subResult = " + subRet);


        Calculator multiOperation = (n1, n2) -> n1 * n2;
        int multiRet = multiOperation.operate(3, 8);
        System.out.println("multiResult = " + multiRet);

        Calculator divideOperation = (n1, n2) -> n1 / n2;
        int divideRet = divideOperation.operate(9, 3);
        System.out.println("divideResult = " + divideRet);

    }
}
