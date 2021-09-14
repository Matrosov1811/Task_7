import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        System.out.println("Задайте размер массива:");
        Scanner s = new Scanner(System.in);
        int[] array = new int[s.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Задайте данные для элемента №" + (i + 1) + " массива");
            array[i] = s.nextInt();
            while ((array[i] == x | array[i] == y | array[i] == z)) {
                System.out.println("Данное значение имеется в константах, введите новое значение для элемента №" + (i + 1));
                array[i] = s.nextInt();
            }
        }
        System.out.println((Arrays.toString(new String[]{"Вывод массива: " + Arrays.toString(array)})));
    }
}