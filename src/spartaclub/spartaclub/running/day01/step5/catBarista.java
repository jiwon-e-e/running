package spartaclub.spartaclub.running.day01.step5;

public class catBarista implements CoffeeMaker {


    @Override
    public Coffee makeCoffee(String menuName) {
        System.out.println("고양이 바리스타 처음보냥");
        System.out.println("냥냥 %s 커피 만드는중 ".formatted(menuName));
        return new Coffee(menuName);
    }
}
