package spartaclub.spartaclub.running.day02.step4;

//주어진 사과가 특정 조건에 맞는지 아닌지만 확인
//람다를 사용하기위해 Funcitonal interfa aece걸어주기

@FunctionalInterface
public interface ApplePredicate {
    boolean test(Apple apple);
}
