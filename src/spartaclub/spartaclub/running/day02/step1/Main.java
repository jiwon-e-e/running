package spartaclub.spartaclub.running.day02.step1;

public class Main {
    public static void main(String[] args) {

        //햄버거 셰프 고용
        HamburgerChef burgerKing = new HamburgerChef();

        //버거킹에게 햄버거 제작 의뢰
        burgerKing.makeBurger(); //기본 햄부기

        //햄부기 레시피 알려주세요
        burgerKing.setRecipe(new CheeseBurgerRecipe());
        burgerKing.makeBurger();
        burgerKing.makeBurger(); //왜 똑같이 만드시죠

        burgerKing.setRecipe(new BaconBurgerRecipe());
        System.out.println("==============");
        burgerKing.makeBurger();
    }
}
