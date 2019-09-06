import java.util.Scanner;

public class PrivateVarAccess1 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        PrivateVarAccess priv = new PrivateVarAccess();

        System.out.println("enter your freind name");
        String sname = name.nextLine();
        priv.setname(sname);
        priv.saying();
    }
}
