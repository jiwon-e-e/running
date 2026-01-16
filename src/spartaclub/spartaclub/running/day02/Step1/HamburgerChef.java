package spartaclub.spartaclub.running.day02.Step1;

public class HamburgerChef {
    //햄버거 만드는 전략
    private BurgerRecipe recipe; //레시피가 있어야 요리가능
    // final 을 걸면 레시피를 다양하게 못 쓰니까 쓰면 안 됨

    //전략 변경 메서드 (setter)

    public void setRecipe(BurgerRecipe recipe) {
        this.recipe = recipe;
    }

    //기능
    public void makeBurger() {
        System.out.println("--- 🍔 조리 시작 ---");
        System.out.println("# 번(빵)을 따뜻하게 굽습니다.");
        System.out.println("# 육즙 가득한 패티를 올립니다.");

        if (recipe != null) {
            // "중간에 뭘 넣을진 모르겠지만, 아무튼 너의 레시피대로 해!" (다형성)
            recipe.cook(); //손님의 레시피대로 요리해
        }

        System.out.println("# 빵을 덮고 포장합니다.");
        System.out.println("--- ✅ 조리 완료 ---\n");
    }
}
