import javax.swing.JOptionPane;

public class inputJOptionPane {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Inputakan nama: ");
        int absen = Integer.parseInt(JOptionPane.showInputDialog("Nomor absen"));
        String sekolah = JOptionPane.showInputDialog("Inputkan sekolah:");
        String alamat = JOptionPane.showInputDialog("Inputkan alamat");
        String asalSekolah = JOptionPane.showInputDialog("asal sekolahmu");
        String lahir = JOptionPane.showInputDialog ("Tanggal lahir");
        String jurusan = JOptionPane.showInputDialog("Inputkan jurusan");

        System.out.println("\n ====Output====");
        System.out.println("Namamu: " + nama);
        System.out.println("Nomor absen: " + absen);
        System.out.println("Sekolah di: " + sekolah);
        System.out.println("Alamatmu: " + alamat);
        System.out.println("Asal sekolahmu: " + asalSekolah);
        System.out.println("Tanggal lahirmu: " + lahir);
        System.out.println("jurusanmu: " + jurusan);

        JOptionPane.showMessageDialog(null, "Namamu adalah: " + nama 
        + "\n Nomor absenmu: " + absen + "\n Sekolah di: " + 
        sekolah + "\n Alamatmu: " + alamat + 
        "\n Asal sekolahmu: " + "\n Tanggal lahirmu: " + lahir + "\n Jurusanmu: " + jurusan);
    }
}
