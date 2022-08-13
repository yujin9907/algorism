package listjava;

import java.util.LinkedList;

public class N02Queue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("허");
        queue.offer("유");
        queue.offer("진");
        System.out.println("현재값: "+queue);

        System.out.println("꺼내기, 선입선출: "+queue.poll());
    }
}
