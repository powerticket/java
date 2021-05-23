package basic;

public class Function {
    static void printHello() {
        System.out.println("Hello");
    }

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        printHello();
        System.out.println(add(5, 10));
    }    
}
