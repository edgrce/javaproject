import java.util.Scanner;

public class percabangan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int belanja;

        System.out.println("===KHUSUS HARI INI=== \n" + "Pembelian Diatas Rp30.000 Mendapatkan 1 Gelas Pop Ice Bebas Varian Rasa!! \n");
        System.out.print("Total belanjaan Anda: ");
        belanja = input.nextInt();

        if (belanja >= 30000) {
        System.out.println("Selamat ! Anda Mendapatkan 1 Gelas Pop Ice Varian Apa Saja");
        } else { 
            int selisihbelanja = 30000 - belanja;
            System.out.println("Belanja anda kurang dari Rp. 30.000");
            System.out.println("Silahkan tambahkan lagi belanjaan anda sebesar Rp. " + selisihbelanja);
            System.out.println("Untuk mendapatkan bonus segelas pop ice!");
        }
    }
}
    

