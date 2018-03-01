package general;

import java.util.ArrayList;
import java.util.List;

public class PECS {

    public static <T>  void write(List<? super T > list,  T elem) {
        list.add(elem);

    }

    public static void main(String[] args) {

        List<Fruit> flist = new ArrayList<Fruit>();
        List<Apple> alist = new ArrayList<Apple>();
        List<Orage> olist = new ArrayList<Orage>();
       //  flist.add(new Apple()); 错误

        write(flist, new Apple());
        write(alist, new Apple());
       // write(olist, new Apple());


    }
}
