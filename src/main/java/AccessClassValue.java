import java.util.Scanner;

public class AccessClassValue {
    public static void main(String[] args) {
        Scanner sdata = new Scanner(System.in);

        AccessValue2 add = new AccessValue2();

        add.simpleData();
        System.out.println("enter your string");
        String name = sdata.nextLine();
        add.addString(name);
    }
}
