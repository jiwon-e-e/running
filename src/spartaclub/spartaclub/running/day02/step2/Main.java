package spartaclub.spartaclub.running.day02.step2;

public class Main {
    public static void main(String[] args) {
        //익명클래스 사용 

        //햄버거 셰프 고용
        HamburgerChef burgerKing = new HamburgerChef();

        // 어떤 손님이 와서 지옥버거 주문
        BurgerRecipe hellRecipe = new BurgerRecipe() {
            //클래스 블록이라 field도 만들 수 있음
            @Override
            public void cook() {
                System.out.println("# 지옥에서 만든 보라색 소스 준비");
            }
        };

        burgerKing.setRecipe(hellRecipe);
        burgerKing.makeBurger();

        burgerKing.setRecipe(new BurgerRecipe() {
            @Override
            public void cook() {
                System.out.println("# 양상추 3장 ");
                System.out.println("# 아보카도 듬뿍~");
            }
        });
        burgerKing.makeBurger();
    }
}
