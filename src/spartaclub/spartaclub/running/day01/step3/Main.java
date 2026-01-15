package spartaclub.spartaclub.running.day01.step3;

public class Main {
    public static void main(String[] args) {
        //바리스타 한 명 나오세요!!
        Barista bariKim = new Barista();
        Customer sonny = new Customer();

        sonny.order("아이스아메리카노",bariKim);
        sonny.order("카페라떼",bariKim);
        sonny.order("카페라떼",bariKim);
        sonny.order("마끼아또",bariKim);
        sonny.order("뜨아",bariKim);
        sonny.order("두쫀쿠",bariKim);


    }
}
