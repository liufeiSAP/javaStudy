package general;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
    public static final List<Apple>  applies = new ArrayList<Apple>();
    public static void main(String[] args) {

        fun(applies);

    }

    public static Fruit fun(List<? extends Fruit> list) {
       return list.get(0);
    }
}

class Apple extends Fruit {
}

class Orage extends Fruit {

}