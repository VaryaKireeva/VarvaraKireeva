import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie17 {
    public static void main(String[] args) {
        String str;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для остановки ввода данных ввести: 'stop' ");
        try (FileWriter fileWriter = new FileWriter("for test.txt"))
        {
            do {
                System.out.print("Введите текст: ");
                str = bufferedReader.readLine();
                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fileWriter.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException ex) {
            System.out.print("Ошибка" + ex);
        }
    }


}
