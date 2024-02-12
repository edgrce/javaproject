import java.util.Scanner;

public class up15hairunisa {
 public static void main(String[] args) {
//buatlah program java yang menerapkan tipe data, variabe, input, operator, percabangan, dan perulangan
//1.bioskop 2.counter 3.tempat wisata 4.deler  
     Scanner input = new Scanner (System.in); 
     int wisata = 0;
     int harga = 0;
 
 do {
 System.out.println("====SELAMAT DATANG DI TEMPAT WISATA KOTA BATU====");
 System.out.println("\n1. Harga Dan Pembelian Tiket Masuk \n2. Macam-Macam Wahana \n3. Jadwal Wisata \n4. Selesai");
 System.out.print("Apa Yang Ingin Anda Ketahui? ");
 wisata = input.nextInt();
 
 switch (wisata) {
    case 1:
     System.out.println("===TIKET MASUK WISATA KOTA BATU===");
     System.out.println("1. Balita      Rp.10.000");
     System.out.println("2. Anak-anak   Rp.20.000");
     System.out.println("3. Remaja      Rp.30.000");
     System.out.println("4. Dewasa      Rp.50.000");
     System.out.println("5. Lanjut Usai Rp.30.000");
     System.out.print("Pilih tiket yang akan anda pesan: ");
     int pilihan = input.nextInt();
      

      if (pilihan == 1){
         harga = 10000;
      } else if (pilihan == 2) {
        harga = 20000;
      } else if (pilihan == 3) {
        harga = 30000;
      } else if (pilihan == 4) {
        harga = 50000;
      } else if (pilihan == 5) {
        harga = 30000;
      }

     System.out.print("Berapa jumlah tiket yang anda beli: ");
     int jumlaht = input.nextInt();
     int total = jumlaht * harga;
     System.out.println("Total harga tiket anda: Rp." + total);
     System.out.println("Nominal uang anda: Rp ");
     int uang = input.nextInt();
     int kembalian = uang - total;
     System.out.println("Kembalian anda: " + kembalian);
     
     System.out.println("\n================ TIKET MASUK WAHANA ==============");
     System.out.println("Tiket yang anda beli: " + jumlaht);
     System.out.println("Harga tiket anda: " + harga);
     System.out.println("Total harga tiket anda: Rp." + total);
     System.out.println("Kembalian anda: Rp." + kembalian);
     System.out.println("======== SELAMAT MENIKMATI LIBUKAN ANDA ========\n");
     break;

    case 2:
     System.out.println("1. Tranpolin");
     System.out.println("2. Rumah Balon");
     System.out.println("3. Bianglala");
     System.out.println("4. Roler Coster");
     System.out.println("5. Arum Jeram");
     break;

    case 3:
     System.out.println("Senin:  07.00-20.00 WIB");
     System.out.println("Selasa: 07.00-20.00 WIB");
     System.out.println("Rabu:   09.00-20.00 WIB");
     System.out.println("Kamis:  07.00-20.00 WIB");
     System.out.println("Jum`at:       TUTUP    ");
     System.out.println("Sabtu:  07.00-00.00 WIB");
     System.out.println("Minggu: 07.00-22.00 WIB");
     break; 
    default:
     System.out.println("Maaf, Tidak ada dalam jangkauan kami.");
    
    }
 } while (wisata != 4 );
}
}
