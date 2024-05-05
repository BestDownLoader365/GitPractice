import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Animal dog2 = new Dog();
        Animal cat2 = new Cat();
        ArrayList<Animal> test = new ArrayList<>();
        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        for(Animal a : test){
            a.speak();
        }
    }
}