package general;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

public class General {

    public static <T>  void test(List<?> obj) {
        System.out.println(obj);
    }
    public static void main(String[] args) {
        //Box类便可以得到复用，我们可以将T替换成任何我们想要的类型
        Box<String>  box = new Box<String>("a");
        System.out.println(box.getObject());


        List<Integer>  aa = new ArrayList<Integer>();
        List<String>  bb = new ArrayList<String>();
        test(aa);
        test(bb);
        

        Pair<String, Integer>  p1 = new Pair<String, Integer>("1", 1);
        Pair<String, Integer>  p2 = new Pair<String, Integer>("1", 1);
        System.out.println(ComUtil.Compare(p1,p2));
    }
}
