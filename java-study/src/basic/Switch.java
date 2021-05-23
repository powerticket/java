package basic;

public class Switch {
    public static void main(String[] args) {
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("월");
                break;
            case 2:
                System.out.println("화");
                break;
            case 3:
                System.out.println("수");
                break;        
            default:
                System.out.println("월화수아님");
                break;
        }
    }
    
}
