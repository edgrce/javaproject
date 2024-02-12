import java.util.Scanner;

public class perulangant {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int penambahan = 2;
    int nilai = 1;

    System.out.print( "MENIT: ");
    int jumlahderet = input.nextInt();

    for (int i = 1; i <= jumlahderet; i++) {
    System.out.print(nilai + " \t");
    nilai += penambahan;
    penambahan++;
  }
    //for
    int i; 
    for (i=0; i<5; i++)
     { 
    System.out.print(i + ". ");  
    System.out.println("Saya berjanji tidak akan mengulangi kesalahan saya lagi");
    }

    //while
    int s=1; 
    while (s<5) 
    { 
    System.out.print(s + " Nama siswa: ");
    String nama = input.nextLine(); 
     s++;
     }
   
     //Do-While
     int n=11; // 5 buah bilangan positif pertama
     int a=-11; 
    do 
    { 
      System.out.print( a + ", "); 
      a++;
    }
    while (a < n);
 }
}

