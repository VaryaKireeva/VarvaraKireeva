import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите строку ");
        String Stroka = a.nextLine();
        String bezprobelov = Stroka.replace(" ","");
        System.out.println(bezprobelov);

    }
}