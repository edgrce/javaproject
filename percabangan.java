import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int belanja;

        System.out.print("Inputkan total belanjaan Anda: ");
        belanja = input.nextInt();

        if (belanja >= 500000) {
        System.out.println("Selamat ! Anda Mendapatkan Hadiah Gantungan Kunci");
        } else { 
            int selisihbelanja = 500000 - belanja;
            System.out.println("Belanja anda kurang dari Rp. 500.000");
            System.out.println("Silahkan tambahkan lagi belanjaan anda sebesar Rp. " + selisihbelanja);
            System.out.println("Untuk mendapatkan bonus gantungan kunci");
        }
    }
}
         

