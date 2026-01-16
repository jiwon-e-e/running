package spartaclub.spartaclub.running.day01.step6;

public enum Menu{
    AMERICANO(20, "아메리카노"),
    LATTE(30, "카페라떼"),
    ESPRESSO(10, "에스프레소");

    private final int requiredBeans;
    private final String menuName;

    Menu (int requiredBeans, String menuName){
        this.requiredBeans = requiredBeans;
        this.menuName = menuName;
    }

    public int getRequiredBeans() {
        return requiredBeans;
    }
    public String getMenuName() {
        return menuName;
    }

    static Menu findMenuName(String menu){
        for (Menu m : values()){
            if (m.menuName.equals(menu)){
                return m;
            }
        }
        throw new IllegalArgumentException("없는 메뉴 입니다.");
    }
}
