import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int size = scanner.nextInt();
        int[] array = new int[size];
        double[] randoms = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = ((int) (Math.random() * size));
        }
        System.out.println("Массив:" + Arrays.toString(array));
        scanner.close();
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максмальное число = " + max);
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное число = " + min);
    }
}