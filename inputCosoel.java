import java.io.Console;

public class inputCosoel {
    public static void main(String[] args) {
        Console input = System.console();

        System.out.print("Inputkan nama: ");
        String nama = input.readLine();

        System.out.print("Inputkan angka: ");
        int angka = Integer.parseInt(input.readLine());

        System.out.print("Inputkan angka desimal: ");
        Double desimal =  Double.parseDouble(input.readLine());

        //Menampilkan inputan

        System.out.println("\n=====Output=====");
        System.out.println("Nama: " + nama);
        System.out.println("Angka:" + angka);
        System.out.println("Desimal:" + desimal);

    } 
}
