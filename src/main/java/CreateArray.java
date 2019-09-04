public class CreateArray {
    public static void main(String[] args) {

        System.out.println("index\tvalue");

        int[] arr = {32, 12, 23, 34, 35};
        int counter;

        for (counter = 0; counter < arr.length; counter++) {

            System.out.println(counter + " \t" + arr[counter]);
        }

    }
}
