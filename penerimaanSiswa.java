import java.util.Scanner;

public class penerimaanSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bantuan Pemerintah: ");
        System.out.print("- KIP \n" + "- KIS \n" + "- PKH \n" + "- Kartu Prakerja \n" + "- PIP \n" );
        System.out.print("Berapakah kartu yang anda miliki: ");
        int kartuKetentuan = input.nextInt();

        boolean syarat = (kartuKetentuan >= 1);

        System.out.println("Apakah calon peserta didik dapat di terima pada jalur afirmasi ? " + syarat);


    }
}
