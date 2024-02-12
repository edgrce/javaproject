import java.util.Scanner;

public class tugasPerulangan {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int menu = 0;
    do {
      System.out.println("-----------------------------------");
      System.out.println("Menu: \n1. Makanan \n2. Minuman \n3. Keluar");
      System.out.print("Masukkan menu pilihan Anda: ");
      menu = input.nextInt();
        switch (menu) {
            case 1:
             System.out.println("1. Takoyaki \n2. Gorengan \n3. Rujak \n4. Tahu Lontong ");
             break;
            case 2:
             System.out.println("5. Pop ice \n6. Kopi \n7. Boba ");
             break;
            case 3:
             System.out.println("Program berhenti!");
             break;
             
            }
            System.out.println("\n");
        }while (menu !=3);
    }
}
