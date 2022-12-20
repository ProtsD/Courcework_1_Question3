import java.util.Arrays;

public class Main {
    ///////Напишите программу, которая переворачивает массив.
    public static void main(String[] args) {
        int[] array = {4, 8, 1, 7, 3};
        for (int i = 0; i <= array.length % 2; i++) {
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}