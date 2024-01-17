import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int size = scanner.nextInt();
        int[] array = new int[size];
        double[] randoms = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = ((int) (Math.random() * size));
        }
        Arrays.sort(array);
        System.out.println("Массив:" + Arrays.toString(array));
        for (int i = 0; i < size; i++) {
            array[i] = ((int) (Math.random() * size) * -1);
        }
        Arrays.sort(array);
        System.out.println("Массив:" + Arrays.toString(array));
        scanner.close();
    }
}
