import java.util.Scanner;

public class inputPpdb {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        System.out.print("nama: ");
        String nama = input.nextLine();

        System.out.print("asal sekolah: ");
        String asalsekolah = input.nextLine();

        System.out.print("tanggal lahir: ");
        String lahir = input.nextLine();

        System.out.print("alamat: ");
        String alamat = input.nextLine();

        System.out.print("wali: ");
        String wali = input.nextLine();

        System.out.print("NISN: ");
        String NISN = input.nextLine();

        System.out.print("PIN: ");
        String PIN = input.nextLine();

        System.out.print("jurusan: ");
        String jurusan = input.nextLine();

        System.out.println("\n======PPDB======");
        System.out.println("Namamu: " + nama);
        System.out.println("Tanggal lahirmu: " + lahir); 
        System.out.println("Alamatmu: " + alamat);
        System.out.println("Dari sekolah: " + asalsekolah);
        System.out.println("Wali: " + wali);
        System.out.println("NISN: " + NISN);
        System.out.println("PIN: " + PIN);
        System.out.println("Jurusanmu: " + jurusan);
            }
    }
    

    
