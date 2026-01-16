package spartaclub.spartaclub.running.day01.step7;

public class BeanStorage {
    private static BeanStorage instance;
    private static int bean = 100;

    private BeanStorage() {}

    public static BeanStorage getInstance(){
        if (instance == null){
            instance = new BeanStorage();
        }

        return instance;
    }

    public int getBean(){
        return bean;
    }

    public void setBean(int bean){
        this.bean = bean;
        System.out.print("   남은 원두: "+bean+"   ");
    }
}
