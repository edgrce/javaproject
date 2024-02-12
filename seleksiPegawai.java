import java.util.Scanner;

public class seleksiPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("PEGAWAI 1\n");

        System.out.print("Tinggi: ");
        int tinggi = input.nextInt();
        System.out.print("Nilai: ");
        int nilai = input.nextInt();

        boolean syarat = (tinggi >= 160) && (nilai >= 80);


        System.out.println("Hasil seleksinya adalah " + syarat);
        

    }
}
