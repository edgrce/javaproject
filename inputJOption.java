import javax.swing.JOptionPane;

public class inputJOption {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan Nama: ");
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Umur: "));

        System.out.println("\n===== OUTPUT =====");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);

        JOptionPane.showMessageDialog(null, "Namamu Adalah: " + nama + 
        "Umurmu Adalah: " + umur);
    }
}
