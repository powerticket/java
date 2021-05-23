package basic;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws Exception {
        try {
            int i;
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(numbers[i]);
            throw new Exception("나는 만들어진 오류");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } finally {
            System.out.println("난 무조건 실행됨!");
        }
    }
}
