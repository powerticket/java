package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("ArrayList");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println();
        
        System.out.println("HashMap");
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("a", "apple");
        hashMap.put("one", 1);
        hashMap.put("b", "banana");
        for (String k: hashMap.keySet()) {
            System.out.println(k);
        }
        for (Object obj: hashMap.values()) {
            System.out.println(obj);
        }
        System.out.println();
        
        System.out.println("Stack");
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println();
        
        System.out.println("Queue");
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}