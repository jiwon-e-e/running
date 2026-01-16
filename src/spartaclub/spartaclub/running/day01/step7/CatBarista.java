package spartaclub.spartaclub.running.day01.step7;

public class CatBarista implements CoffeeMaker {
    private int beans = 100;

    BeanStorage storage = BeanStorage.getInstance();
    int bean = storage.getBean();

    @Override
    public Coffee makeCoffee(Menu menu) {
        //System.out.println("고양이 바리스타 처음보냥");
        if (bean >= menu.getRequiredBeans()){
            bean -=menu.getRequiredBeans();
            storage.setBean(bean);
            System.out.println("냥냥 %s 커피 만드는중 ".formatted(menu.getMenuName()));
            return new Coffee(menu.getMenuName());
        }else{
            System.out.println("장사접었냥...");
            return null;
        }
    }
}
