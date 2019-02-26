

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        final int x = 5;
        final int y = 6;
        final int z = 7;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int t = sc.nextInt();
        if (t == x || t == y || t== z)
        {
            System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println("Такой константы нет");
        }

    }



}
