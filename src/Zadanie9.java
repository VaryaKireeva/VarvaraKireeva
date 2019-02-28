import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите несколько чисел ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] massiv = { (x*2),(y*2),(z*2),(a*2),(b*2) };
        System.out.println(Arrays.toString(massiv));
    }
}
