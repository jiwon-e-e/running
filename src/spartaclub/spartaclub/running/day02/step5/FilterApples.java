package spartaclub.spartaclub.running.day02.step5;

import java.util.ArrayList;
import java.util.List;

public class FilterApples {


    List<Apple> filterApplesByColor (List<Apple> fullAppleBasket, Color targetColor){
        List<Apple> filteredBasket = new ArrayList<>();

        for (Apple apple: fullAppleBasket){
            if (targetColor == apple.getColor()){
                filteredBasket.add(apple);
            }
        }
        return filteredBasket;
    }

    List<Color> filterAppleColor (List<Apple> fullAppleBasket){
        List<Color> AppleColor = new ArrayList<>();

        for (Apple apple: fullAppleBasket){
            AppleColor.add(apple.getColor());
        }
        return AppleColor;
    }

    List<Color> filterDistinctColor (List<Apple> fullAppleBasket){
        List<Color> distinctColor = new ArrayList<>();

        for (Apple apple: fullAppleBasket){
            if (!distinctColor.contains(apple.getColor())){
                //System.out.println("+ "+ apple.getColor());
                distinctColor.add(apple.getColor());
            }
        }
        return distinctColor;
    }

    List<Integer> filterWeight (List<Apple> fullAppleBasket){
        List<Integer> weightList = new ArrayList<>();
        for(Apple apple: fullAppleBasket){
            weightList.add(apple.getWeight());
        }
        return weightList;
    }

    List<Object> mapApples(List<Apple> fullAppleBasket, AppleFunction function){
        List<Object> filteredList = new ArrayList<>();

        for(Apple apple: fullAppleBasket){
            filteredList.add(function.apply(apple));
        }
        return filteredList;
    }

    <T,R> List<R> map(List<T> list, GenericFunction<T,R> function){
        List<R> genericFilterList = new ArrayList<>();

        for (T t: list){
            genericFilterList.add(function.apply(t));
        }
        return genericFilterList;
    }
}
