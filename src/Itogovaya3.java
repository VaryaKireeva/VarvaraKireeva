import java.util.Scanner;

public class Itogovaya3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в рублях: ");
        double summarub = scanner.nextDouble();
        System.out.print("Введите текущий курс доллара к рублю: ");
        double tekushiykurs = scanner.nextDouble();
        System.out.println(summarub/tekushiykurs);
    }
}