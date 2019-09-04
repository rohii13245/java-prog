import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
       int age=2;
        switch (age) {

            case 1:
                System.out.println("your small");
                break;

            case 2:
                System.out.println("your tall");
                break;
            case 3:
                System.out.println("your middle");
                break;
            default:
                System.out.println("your not in size");
                break;
        }

    }


}
