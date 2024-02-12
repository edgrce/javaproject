import java.util.Scanner;

public class aritmatikaScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Harga pensil: ");
        int angka1 = input.nextInt();

        System.out.print("Jumlah pensil: ");
        int angka2 = input.nextInt();

        System.out.print("Harga buku: ");
        int angka3 = input.nextInt();

        System.out.print("Jumlah buku: ");
        int angka4 = input.nextInt();

        System.out.print("Harga penggaris: ");
        int angka5 = input.nextInt();

        System.out.print("Jumlah penggaris: ");
        int angka6 = input.nextInt();

        System.out.print("Harga cat air: ");
        int angka7 = input.nextInt();

        System.out.print("Jumlah cat air: ");
        int angka8 = input.nextInt();

        System.out.print("Harga pulpen: ");
        int angka9 = input.nextInt();

        System.out.print("Jumlah pulpen: ");
        int angka10 = input.nextInt();

        
        System.out.print("Uang tunai: ");
        int angka11 = input.nextInt();


        int kali = angka1 * angka2;
        int kali1 = angka3 * angka4;
        int kali2 = angka5 * angka6;
        int kali3 = angka7 * angka8;
        int kali4 = angka9 * angka10;
        int jumlah = kali + kali1 + kali2 + kali3 + kali4;
        int kembalian = angka11 - jumlah;

        System.out.println("\n===Pembayaran===\n");
        System.out.println(angka2 + "x " + "Pensil: " + kali );
        System.out.println(angka4 + "x " + "Buku: " + kali1);
        System.out.println(angka6 + "x " + "Cat air" + kali2);
        System.out.println(angka8 + "x " + "Cat air:" + kali3);
        System.out.println(angka10 + "x " + "Pulpen: " + kali4);
        System.out.println("_______________________+");
        System.out.println("Total Pembayaran: " + "Rp" + jumlah);
        System.out.println("Uang tunai: " + "Rp" + angka11);
        System.out.println("Kembalian anda: " + "Rp" + kembalian);
        System.out.println("===Terimakasih, datanglah kembali===");

    }
}
