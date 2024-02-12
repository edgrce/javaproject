import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class hargacelana {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Mereknya apa? ");
        String merek = input.readLine();

        int ukuran = 0;
        int harga = 0;

        if (merek.equals("ABC")) {
        System.out.print("Ukurannya berapa? ");
        ukuran = Integer.parseInt(input.readLine());  

        if (ukuran >= 26 && ukuran <= 30) {
            harga = 16000;
        } else if (ukuran >=31 && ukuran <= 34) {
            harga = 18000;
        }

     System.out.println("Merek: " + merek);
     System.out.println("Ukuran: " + ukuran);
     System.out.println("Harga: Rp. " + harga);

     } else if (merek.equals("DEF")) {
        System.out.println("Ukurannya apa? ");
        ukuran = Integer.parseInt(input.readLine());

       if (ukuran >= 26 && ukuran <= 30) {
            harga = 21000;
        } else if (ukuran >=31 && ukuran <= 34) {
            harga = 23000;
        }
        
     System.out.println("Merek: " + merek);
     System.out.println("Ukuran: " + ukuran);
     System.out.println("Harga: Rp. " + harga);

     } else {
        System.out.println("Maaf, tidak ada merek yang anda mau.");
     }
    }
}

