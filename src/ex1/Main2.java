package ex1;

/**
 * Created by script on 04.03.16.
 */
public class Main2 {
    public static void main(String[] args) {
        new Cat("swrgerg", 17); //если со стека нет ссылки на обьект в куче,
                                //а в куче обьект указывает на другой обьект в куче
                                //все равно обьект будет уничтожен GC
        Cat cat1 = new Cat("dfgbhrftb", 65);
        Cat cat2 = new Cat("dfgbdefbvhrftb", 34);

        cat1.about();
        //Cat tempCat = cat1;// временная кошка))
        cat1 = cat2; // теперь cat1 попадет под GC
        cat1.about();
        //tempCat.about();
    }
}

