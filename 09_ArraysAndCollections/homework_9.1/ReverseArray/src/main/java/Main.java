import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //String line = "Каждый охотник желает знать, где сидит фазан";
        String[] array = {"a", "b", "c", "d"};

        System.out.println(Arrays.toString(array));

        String[] reversArray = ReverseArray.reverse(array);

        System.out.println(Arrays.toString(reversArray));
    }
}
