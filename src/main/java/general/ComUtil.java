package general;

import java.util.List;

public class ComUtil {
    //  比较任意键值对的大小
    public static boolean Compare(Pair p1, Pair p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static <T extends Comparable<T>> int count(List<T> list, final T  elem) {
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(elem) > 0)
                j++;
        }
        return j;
    }
}
