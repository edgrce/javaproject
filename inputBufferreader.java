import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputBufferreader {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

         System.out.print("Inputkan nama: ");
         String nama = input.readLine();

         System.out.print("Inputkan angka: ");
         int angaka = Integer.parseInt(input.readLine());

         System.out.print("inputakan angka desimal: ");
         double desimal = Double.parseDouble(input.readLine());

         //menampilkan output

         System.out.println("\n======Output=====");
         System.out.println("Nama: " + nama);
         System.out.println("Angaka: " + angaka);
         System.out.println("desimal: " + desimal);
    }
}
