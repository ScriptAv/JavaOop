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

    void about() {
        String s = "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", tail=" + tail +
                ", talisman=" + talisman +
                '}';
        System.out.println(s);
    }

    // конструктор
//    Cat(){
//        System.out.println("dgfbtg");
//    }


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
