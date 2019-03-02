import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        String S = scan.next();
        int X = Integer.parseInt(S.trim());
        double Y = (double) X;
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
    }
}
