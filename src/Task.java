import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int arrAy[] = new int[size];
        System.out.println("Введите элемент массива:");
        for (int i = 0; i < size; i++) {
            arrAy[i] = input.nextInt();
        }
        Sorting.bubbleSort(arrAy);
        System.out.print ("Отсортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + arrAy[i]);
        }
    }
}
