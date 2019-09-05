import java.util.Random;

public class RandomArrayValue {

    public static void main(String[] args) {
        Random ran = new Random();

        int[] freq = new int[7];
        int roll;
        int face;

        for (roll = 1; roll < 100; roll++) {
            ++freq[1 + ran.nextInt(6)];
        }

        System.out.println("face\tfrequency");

        for (face = 0; face < freq.length; face++) {

            System.out.println(face + "\t" + freq[face]);
        }
    }
}
