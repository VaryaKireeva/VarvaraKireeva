import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Zadanie16 {
    public static void main(String arg[]) {
        String s;
        try (
                BufferedReader br = new BufferedReader(new FileReader("C:\\project\\for test.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            System.out.print("Ошибка" + ex);
        } catch (IOException ex) {
            System.out.print("Ошибка" + ex);
        }
    }
}
