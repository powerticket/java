package behavioral;

public class Facade {
    public void complicatedJob1() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
    }
     
    public void complicatedJob2() {
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);
    }

    public static void main(String[] args) {
        new Facade().complicatedJob1();
        new Facade().complicatedJob2();
    }
}
