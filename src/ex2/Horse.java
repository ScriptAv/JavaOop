package ex2;

/**
 * Created by script on 04.03.16.
 */
public class Horse {
    String name;
    int age;
    boolean isMale;
    String color;
    int speed;

    void eat(){
        System.out.println("eating..");
    }

    void about(){
        String sex = (isMale) ? "Male" : "Fenale";// тернарный оператор
        System.out.printf("name: %s, age: %d, sex: %s", name, age, sex);
    }

    void ride(){
        about();
        System.out.println("riding at speed" + speed);
    }
}
