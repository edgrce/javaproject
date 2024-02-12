import java.util.Scanner;

public class programPengolahAngka { 
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int angka1 = 0, angka2 = 0; 

        System.out.println("===MENU PAKET HEMAT WARUNG TAKOYAKI===");
        System.out.println("1. Menu paket Makanan");
        System.out.println("2. Menu paket Minuman");
        System.out.println("Masukkan pilihan anda: ");
        int pilihanmenu = input.nextInt();

        switch (pilihanmenu) {
            case 1:
            System.out.println("1. Paket besar takoyaki  Rp.10.000\n" 
            + "2. Paket kecil takoyaki  Rp.6.000\n" 
            + "3. Paket sedang takoyaki Rp.8.000\n" 
            + "4. Paket besar gorengan  Rp.15.000\n");
            System.out.println("Pilih paket anda: ");
            angka1 = input.nextInt();

            if (angka1 == 1) {
                System.out.println("Menu paket " + angka1 + " Menuat: \n- 5 biji takoyaki sosis \n- 10 biji takoyaki udang" );
            } else if (angka1 == 2) {
                System.out.println("Menu paket " + angka1 + " Menuat: \n- 5 biji takoyaki sosis \n- 3 biji takoyaki udang");
            } else if (angka1 == 3) {
                System.out.println("Menu paket " + angka1 + " Menuat: \n- 3 biji takoyaki sosis \n- 3 biji takoyaki udang");
            } else if (angka1 == 4) {
                System.out.println("Menu paket " + angka1 + " Menuat: \n- 7 Gorengan satu jenis \n- 10 Gorengan bebas pilih");
            }
            break;
            
            case 2:
            System.out.println("1. Paket besar Pop ice  Rp.15.000\n" 
            + "2. Paket kecil Pop ice  Rp.10.000\n" 
            + "3. Paket kecil Boba     Rp.20.000\n" 
            + "4. Paket besar Boba     Rp.30.000\n");
            System.out.println("Pilih paket anda: ");
            angka2 = input.nextInt();

            if (angka2 == 1) {
                System.out.println("Menu paket " + angka2 + " Menuat: \n- 2 Cup Pop ice kecil \n- 4 Cup Pop ice besar");
            } else if (angka2 == 2) {
                System.out.println("Menu paket " + angka2 + " Menuat: \n- 2 Cup Pop ice kecil \n- 2 Cup Pop ice besar");
            } else if (angka2 == 3) {
                System.out.println("Menu paket " + angka2 + " Menuat: \n- 2 Cup Boba kecil \n- 3 Cup Boba besar");
            } else if (angka2 == 4) {
                System.out.println("Menu paket " + angka2 + " Menuat: \n- 3  Cup Boba kecil \n- 5 Cup Boba besar");
            }
            break;

            default:
            System.out.println("Pilihan Anda Tidak Tersedia");
        }
    }
    }