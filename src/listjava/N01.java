package listjava;

import java.util.LinkedList;

public class N01 {
    public static void main(String[] args) {
        //stack
        LinkedList<String> stack = new LinkedList<>();
        stack.push("허");
        stack.push("유");
        stack.push("진");
        System.out.println("현재 값: "+stack);

        String data = stack.pop();
        System.out.println("pop, 선입후출: "+stack);
        System.out.println("꺼낸자료: "+stack.pop());
    }
}
