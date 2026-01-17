package spartaclub.spartaclub.running.day02.Step4;

import java.util.List;

import static spartaclub.spartaclub.running.day02.Step4.Color.*;
import static spartaclub.spartaclub.running.day02.Step4.FilterApples.*;
import static spartaclub.spartaclub.running.day02.Step4.WareHouse.appleBasket;

public class Main {
    public static void main(String[] args) {

        List<Apple> greenApples
                = filterGreenApples(appleBasket);

        for (Apple greenApple : greenApples) {
            System.out.println("greenApple = " + greenApple);
        }

        System.out.println("============");
        List<Apple> appleList2 = filterApplesByColor(appleBasket, YELLOW);
        for (Apple apple : appleList2) {
            System.out.println("apple = " + apple);
        }

        System.out.println("======100g 이상인 사과들 필터링 ======");
        List<Apple> appleList3 = filterApples(appleBasket, apple -> apple.getWeight()>=100);

        for (Apple apple : appleList3) {
            System.out.println("apple = " +apple);
        }


        System.out.println("======100g 미만이면서 빨간 사과들 필터링 ======");
        List<Apple> appleList4 = filterApples(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()<100 && apple.getColor() ==RED;
            }
        });

        for (Apple apple : appleList4) {
            System.out.println("apple = " +apple);
        }

        System.out.println();
        System.out.println();

        System.out.println("======숫자 리스트 중에서 짝수만 필터링 ======");
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 35, 15, 77, 23124, 56);
        List<Integer> filter1 = filter(integerList, n -> n % 2 == 0);

        System.out.println("filter1 = " + filter1);


        System.out.println();
        System.out.println();

        List<Apple> filter3 = filter(appleBasket, a -> a.getColor() == RED || a.getColor() == YELLOW);
        System.out.println("filter3 = " + filter3);
    }
}
