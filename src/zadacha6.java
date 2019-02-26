import java.util.Scanner;

public class zadacha6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int x = sc.nextInt();
        System.out.println("Введите число ");
        int y = sc.nextInt();
        System.out.println("Введите число ");
        int z = sc.nextInt();
        double s = ((x+y+z)/3);
        double d = (s/2);
        System.out.println("Среднее арифметическое = " + s);
        System.out.println(d);
        if(d>3){
            System.out.println("Программа выполнена корректно");
        }

    }
}
