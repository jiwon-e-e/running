package spartaclub.spartaclub.running.day01.step1;

public class Main {
    public static void main(String[] args) {
        //바리스타 한 명 나오세요!!
        Barista bariKim = new Barista();
        Customer sonnom = new Customer();

        sonnom.order(("아이스아메리카노"),bariKim);

        bariKim.beans =0;
        System.out.println("누군가 원두를 다 훔쳐감: " + bariKim.beans);
    }
}
