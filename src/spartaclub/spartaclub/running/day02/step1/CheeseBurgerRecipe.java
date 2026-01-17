package spartaclub.spartaclub.running.day02.step1;

public class CheeseBurgerRecipe implements BurgerRecipe{

    @Override
    public void cook() {
        System.out.println("# 치즈를 40장 녹입니다.");
        System.out.println("# 그대로 패티위에 올려주세요~");
    }
}
