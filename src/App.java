import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "d:\\in.txt"; // caminho do arquivo

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { // try with resources!!! Fecha os recursos
                                                                             // automaticamente
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
            e.getStackTrace();
        }
    }// main
}// class
