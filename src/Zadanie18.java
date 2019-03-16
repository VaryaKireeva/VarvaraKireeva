import java.io.*;

public class Zadanie18 {
    public static void main(String arg[]) {
        String s;
        String s2;
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

        try (
                BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
                FileWriter fileWriter = new FileWriter ("C:\\project\\for test.txt")) {
            System.out.println("Введите текст: ");
            s2 = br2.readLine();
            s2 = s2 + "\r\n";
            fileWriter.write(s2);
        }catch (IOException ex) {
            System.out.println("Ошибка" + ex);
        }


    }

}
