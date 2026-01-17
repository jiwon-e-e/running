package spartaclub.spartaclub.running.day02.step5;

import spartaclub.spartaclub.running.day01.step7.BeanStorage;

import java.util.ArrayList;
import java.util.List;

import static spartaclub.spartaclub.running.day02.step5.Color.*;

public class WareHouse {

    private static WareHouse instance;

    private static List<Apple> appleBasket = List.of(
            new Apple(GREEN, 120),
            new Apple(RED, 50),
            new Apple(YELLOW, 67),
            new Apple(YELLOW, 180),
            new Apple(YELLOW, 55),
            new Apple(YELLOW, 111),
            new Apple(GREEN, 202),
            new Apple(GREEN, 139),
            new Apple(RED, 158),
            new Apple(RED, 171),
            new Apple(RED, 88)
    );

    public static WareHouse getInstance(){
        if (instance == null){
            instance = new WareHouse();
        }
        return instance;
    }

    public List<Apple> getBasket(){
        return appleBasket;
    }

}
