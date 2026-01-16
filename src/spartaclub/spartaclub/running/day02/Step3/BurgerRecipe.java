package spartaclub.spartaclub.running.day02.Step3;

//햄부기 레시피 명세서
// 레시피가 뭔진 모르겠는데(추상화) 그대로 요리해
// 추상메서드가 1개여야함 (세미콜론으로 끝나는애들)
// -> 일반메서드와 static 메서드는 추가 가능
public interface BurgerRecipe {
    void cook();

    static void foo(){
        System.out.println("static 메서드는 구현 가능! ");
    }
    default void bar(){
        System.out.println("일반 메서드도 구현 가능! ");
    }
}
