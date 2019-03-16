import java.util.Scanner;

public class Itogovaya2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }
        for (int n = 1; n < array.length; n++) {
            for (int m = 0; m < array.length - 1; m++) {
                if (array[n] < array[m]) {
                    array[n] = array[n] + array[m];
                    array[m] = array[n] - array[m];
                    array[n] = array[n] - array[m];
                }
            }
        }

        for (int n = 0; n < array.length; n++) {
            System.out.print("Элемент [" + n + "]: " + array[n] + "\n");
        }
    }
}