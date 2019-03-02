import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку #1: ");
        String s1 = scan.next();
        System.out.print("Введите строку #2: ");
        String s2 = scan.next();
        if (s1.length() >= s2.length()) {
            System.out.println(s1);
        } else {
            System.out.println(s2);

        }
    }
}