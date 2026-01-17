package spartaclub.spartaclub.running.day02.step1;

public class BaconBurgerRecipe implements BurgerRecipe{
    @Override
    public void cook() {
        System.out.println("# 베이컨 3장을 크런키하게 굽는다");
        System.out.println("# 베이컨을 부숴서 뿌려줘");
        System.out.println("# 마요네즈를 잊지마!");
    }
}
