import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int number = Integer.parseInt(scan.nextLine());

        int[] array = new int[number];
        int min = 0;
        int max = 100;
        int temp;

        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * (max - min));
        }

        System.out.println("Original");

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " " + array[i]);
        }

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
        }

        System.out.println("Reversed");

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " " + array[i]);
        }

    }
}