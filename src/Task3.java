import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
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
        int indexOfMax = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            }
        }
        System.out.println("Индекс максимального элемента = " + indexOfMax);
        int indexOfMin = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println("Индекс минимального элемента = " + indexOfMin);
    }
}