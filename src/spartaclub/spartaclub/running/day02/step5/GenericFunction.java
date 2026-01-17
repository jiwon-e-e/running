package spartaclub.spartaclub.running.day02.step5;

@FunctionalInterface
public interface GenericFunction <T,R>{
    R apply (T t);
}
