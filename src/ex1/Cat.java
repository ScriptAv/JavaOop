package ex1;

/**
 * Created by script on 04.03.16.
 */
public class Cat {
    String name;
    int age;
    boolean isMale;
    Tail tail;// композиция
    Talisman talisman;// агрегация
    void voice(){
        System.out.println("myau");
    }
    Cat(){
        System.out.println("dgfbtg");
    }
}
