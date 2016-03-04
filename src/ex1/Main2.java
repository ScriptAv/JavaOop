package ex1;

/**
 * Created by script on 04.03.16.
 */
public class Main2 {
    public static void main(String[] args) {
        new Cat("swrgerg", 17); //если со стека нет ссылки на обьект в куче,
                                //а в куче обьект указывает на другой обьект в куче
                                //все равно обьект будет уничтожен GC
    }
}

