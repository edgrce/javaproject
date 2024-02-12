import javax.swing.JOptionPane;

public class konversiPlat {

    public static void main(String[] args) {

       String plat = JOptionPane.showInputDialog("Masukkan kode Plat Nomor: ");

       switch (plat) {
        case "L" :
           JOptionPane.showMessageDialog(null, "Surabaya");
           break;
        case "M" :
           JOptionPane.showMessageDialog(null,"Madura");
           break;
        case "N" :
           JOptionPane.showMessageDialog(null,"Malang, Pasuruhan, Probolinggo, Batu, Lumajang.");
           break;
        case "S" :
          JOptionPane.showMessageDialog(null,"Tuban, Jombang, Bojonegoro, Lamongan, Mojokerto");
           break;
        case "W" :
           JOptionPane.showMessageDialog(null,"Gresik, Sidoarjo");
           break;
        case "P" :
          JOptionPane.showMessageDialog(null,"Banyuwangi, Bondowoso, Besuki, Jember, Situbondo");
           break;
        default :
        JOptionPane.showMessageDialog(null,"Plat yang anda cari berada di luar daerah Jawa Timur.");
       }

    }
}
