package basic;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        System.out.println(arr.length);

        String[] strs;
        strs = new String[] {"a", "b"};
        System.out.println(strs[0]);

        ArrayList<Integer>  arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.get(4));
     }
}
