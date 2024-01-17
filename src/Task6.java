import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
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
        boolean flag = true;
        for (int i = 1; i < size; i++) {
            if (array[i] <= array[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
