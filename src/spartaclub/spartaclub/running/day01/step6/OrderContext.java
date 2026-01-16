package spartaclub.spartaclub.running.day01.step6;

public class OrderContext {

    // 오전반 설정: 사람 바리스타 + 캐셔
    public static Cashier configMorningShift() {
        return new Cashier(new Barista()); // 의존성 주입 (DI)
    }

    // 오후반 설정: 로봇 바리스타 + 캐셔
    public static Cashier configAfternoonShift() {
        return new Cashier(new CatBarista()); // 의존성 주입 (DI)
    }
}
