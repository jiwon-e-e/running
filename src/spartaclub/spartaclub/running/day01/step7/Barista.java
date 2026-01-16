package spartaclub.spartaclub.running.day01.step7;

// ⭕ GOOD Code: 내 상태(beans)는 내가 관리한다! (캡슐화)

public class Barista implements CoffeeMaker {
    // 1. private으로 외부 접근 차단
    //private int beans = 100; // 커피 원두 양 (그램)

    BeanStorage storage = BeanStorage.getInstance();
    int bean = storage.getBean();
    // 2. 상태를 변경하는 로직을 스스로 수행 (책임 수행)
    @Override
    public Coffee makeCoffee(Menu menu) {
        if (bean >= menu.getRequiredBeans()) {
            bean -= menu.getRequiredBeans();
            storage.setBean(bean);
            System.out.println("바리스타: (쓱싹쓱싹) 커피 만드는 중...");
            return new Coffee(menu.getMenuName());
        } else {
            System.out.println("바리스타: 원두가 부족합니다!");
            return null; // 간단한 예제를 위해 null 반환
        }
    }
}
