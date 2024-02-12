import javax.swing.JOptionPane;

public class operatorAssignment2 {

    public static void main(String[] args) {
         
        int sirup = 5;
        int detergen = 6;
        int mie = 10;

        JOptionPane.showMessageDialog(null, "=====DAFTAR STOK PRODUK=====" + " \n Sirup: " + sirup + " botol" +
        "\n Deterjen: " + detergen + " bungkus" + "\n Mie: " + mie + " bungkus");

        sirup +=  Integer.parseInt(JOptionPane.showInputDialog("Sirup yang ditambhakan: "));
         

        detergen += Integer.parseInt(JOptionPane.showInputDialog("Detergen yang ditambahkan"));
         
        mie += Integer.parseInt(JOptionPane.showInputDialog("Mie yang ditambahkan: "));
       
        JOptionPane.showMessageDialog(null, "====BARANG TAMBAHAN DALAM MINIMARKET==== \n" 
        +"\n sirup: " + sirup + " botol" +
        "\n detergen: " + detergen + " bungkus" + 
        "\n mie: " + mie + " bungkus \n" + 
        "\n ======TERIMA KASIH======");

    }
}
