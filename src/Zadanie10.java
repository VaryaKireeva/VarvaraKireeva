import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ширина массива: ");
        int b = sc.nextInt();
        System.out.print("Высота массива: ");
        int a = sc.nextInt();
        int[][] massiv = new int[a][b];
        for (int c = 0; c < a; c++) {
            for (int d = 0; d < b; d++) {
                System.out.print("Введите значение массива [" + c + "][" + d + "]: ");
                massiv[c][d]=sc.nextInt();
            }
        }
        for (int i = 0; i<b; i++){
            System.out.println(massiv[0][i]*3);
        }
    }
}
