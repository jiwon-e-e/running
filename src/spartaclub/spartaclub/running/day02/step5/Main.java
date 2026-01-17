package spartaclub.spartaclub.running.day02.step5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static spartaclub.spartaclub.running.day02.step5.Color.*;

public class Main {
    public static void main(String[] args) {
        FilterApples filterTool = new FilterApples();
        WareHouse wareHouse = WareHouse.getInstance();

        System.out.println("\n0. 특정 색상의 사과들만 출력 (복습)");

        Color targetColor = GREEN;
        List<Apple> greenApples = filterTool.filterApplesByColor(wareHouse.getBasket(), targetColor);

        System.out.println("## " +targetColor);
        for (Apple apple : greenApples){
            System.out.println(apple.getWeight());
        }

        System.out.println("\n1 (1). 사과 색상만 출력");

        List<Color> appleColor = filterTool.filterAppleColor(wareHouse.getBasket());
        for (Color color: appleColor) {
            System.out.print(color +"  ");
        }

        System.out.println("\n1 (2). 구분되는 사과 색상만 출력");

        List<Color> distinctColor = filterTool.filterDistinctColor(wareHouse.getBasket());
        for (Color color: distinctColor) {
            System.out.print(color +"  ");
        }
        System.out.println();

        System.out.println("\n2. 사과 무게만 출력");

        List<Integer> weightList = filterTool.filterWeight(wareHouse.getBasket());
        for (Integer weight: weightList){
            System.out.print( weight+"   ");
        }
        System.out.println();

        System.out.println("\n3. 동작 파라미터화 ");

        List<Object> filteredList = filterTool.mapApples(wareHouse.getBasket(), apple -> apple.getColor().toString()+" "+apple.getWeight());
        for (Object obj: filteredList){
            System.out.print(obj+"  ");
        }
        System.out.println();

        System.out.println("\n4. 제네릭 활용");

        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> mapTimesTen = filterTool.map(integerList, a -> a*10);
        List<String> mapWithStr = filterTool.map(integerList, a-> a+"♡");

        for(Integer i: mapTimesTen){
            System.out.print(i+"  ");
        }
        System.out.println();

        for(String str: mapWithStr){
            System.out.print(str+"  ");
        }

    }
}
