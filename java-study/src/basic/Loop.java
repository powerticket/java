package basic;

public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println();
        int[] arr = {1, 3, 5, 7, 9};
        for(int i: arr) {
            System.out.println(i);
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
