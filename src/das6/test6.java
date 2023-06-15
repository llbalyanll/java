package das6;


import java.util.Arrays;
import java.util.Random;

public class test6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(11);
        }
        System.out.println(Arrays.toString(array));


    }
}