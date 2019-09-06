import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {
        Random dice=new Random();

        int counter,number;

        for(counter=0;counter<=10;counter++){
            number = 1+dice.nextInt(6);

            System.out.println(number +"  ");

        }
    }
}
