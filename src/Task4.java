import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
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
        int zero = 0;
        for (int e : array) {
            if (e == 0) zero++;
        }
        if (zero == 0) {
            System.out.println("Нулевых элементов нет");
        } else {
            System.out.println("Количество нулей = " + zero);
        }
    }
}