package spartaclub.spartaclub.running.day01.step6;

public class CatBarista implements CoffeeMaker {
    private int beans = 100;


    @Override
    public Coffee makeCoffee(Menu menu) {
        System.out.println("고양이 바리스타 처음보냥");
        if (this.beans >= menu.getRequiredBeans()){
            this.beans-=menu.getRequiredBeans();
            System.out.println("냥냥 %s 커피 만드는중 ".formatted(menu.getMenuName()));
            return new Coffee(menu.getMenuName());
        }else{
            System.out.println("장사접었냥...");
            return null;
        }
    }
}
