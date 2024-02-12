import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugaspercabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("1. paket kecil dorayaki : Rp. 10.000 \n2. paket kecil pop ice  : RP. 10.000 \n3. paket kecil boba     : Rp.15.000 \n4. paket besar takoyaki : Rp. 17.000 \n5. paket besar pop ice  : Rp. 17.000 \n6. paket boba besar     : Rp.20.000");
        System.out.print("\nPaket mana yang akan anda beli (kecil/besar)? ");
        String ukuran = input.readLine();
         
        int paket = 0;
        int harga = 0;
        int jumlah = 0;

        if (ukuran.equals("kecil")) {
        System.out.print("Paket nomor berapa? ");
        paket = Integer.parseInt(input.readLine());  
        System.out.print("Berapa paket yang anda beli? ");
        jumlah = Integer.parseInt(input.readLine());  


        if (paket >= 1 && paket <= 2) {
            harga = 10000;
        } else if (paket ==3) {
            harga = 15000;
        }

     System.out.println("Ukuran: " + ukuran);
     System.out.println("Paket: " + paket);
     System.out.println("Harga: Rp. " + harga);
     System.out.println("Total harga: " + jumlah * harga);

     } else if (ukuran.equals("besar")) {
        System.out.println("paket nomor berapa? ");
        paket = Integer.parseInt(input.readLine());
        System.out.print("Berapa paket yang anda beli? ");
        jumlah = Integer.parseInt(input.readLine());  


       if (paket >= 4 && paket <= 5) {
            harga = 17000 ;
        } else if (paket == 6) {
            harga = 20000;
        }
        
     System.out.println("Ukuran: " + ukuran);
     System.out.println("Paket: " + paket);
     System.out.println("Harga: Rp. " + harga);
     System.out.println("Total harga: " + jumlah * harga);


     } else {
        System.out.println("Paket tersebut tidak ada di menu kami.");
     }
    }
}
