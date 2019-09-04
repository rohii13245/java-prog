import java.util.Scanner;

public class InputFromSys {
    public static void main(String[] args) {
        Scanner bucky = new Scanner(System.in);

        double fnum, snum, ans;

        System.out.println("enter the 1st no");
        fnum = bucky.nextDouble();
        System.out.println("enter the 2nd no");
        snum = bucky.nextDouble();
        System.out.println("answer is");

        ans = fnum + snum;
        System.out.println(ans);


    }
}
