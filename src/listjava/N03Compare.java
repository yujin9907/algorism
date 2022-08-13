package listjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
class Desc implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2) * -1; // 내림차순(-1을 통해 양수음수 전환)
    }

}
public class N03Compare {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>(Arrays.asList("b", "c", "a", "h", "z"));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new Desc());
        System.out.println(list);
    }
}
