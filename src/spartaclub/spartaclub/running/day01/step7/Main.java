package spartaclub.spartaclub.running.day01.step7;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1일차 Step 7: 원두창고와의 객체 협력을 통해 원두를 공급 ===");

        Customer customer = new Customer();

        // [1] 오전 타임
        // Main(사용자)은 '누가' 일하는지 구체적으로 알 필요가 없습니다.
        // 그냥 "오전반 세팅해줘"라고 요청할 뿐입니다.
        System.out.println("\n[1] 오전반 영업 시작");
        Cashier morningCashier = OrderContext.configMorningShift();

        customer.order("에스프레소", morningCashier);
        customer.order("카페라떼", morningCashier);
        customer.order("카페라떼", morningCashier);


        // [2] 오후 타임
        // "오후반 세팅해줘"
        System.out.println("\n[2] 오후반 영업 시작");
        Cashier afternoonCashier = OrderContext.configAfternoonShift();
        customer.order("아메리카노", afternoonCashier);
        customer.order("카페라떼", afternoonCashier);

        //System.out.println("\n-> 결론: 객체를 '쓰는' 쪽(Main)과 '조립하는' 쪽(OrderContext)을 분리했다!");
    }
}