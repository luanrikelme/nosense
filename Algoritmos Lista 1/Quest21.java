
import javax.swing.JOptionPane;
public class Quest21 {
    public static void main(String[] args) {
        int qtd_lata, qtd_garrafa_p, qtd_garrafa_g;
        double litros;
        String s_qtd_lata, s_qtd_garrafa_p, s_qtd_garrafa_g;

        s_qtd_lata = JOptionPane.showInputDialog(null, "Quantas latas de 350 ml você comprou?");
        s_qtd_garrafa_p = JOptionPane.showInputDialog(null, "Quantas garrafas de 600 ml você comprou?");
        s_qtd_garrafa_g = JOptionPane.showInputDialog(null, "Quantas garrafas de 2L você comprou?");
        qtd_lata = Integer.parseInt(s_qtd_lata);
        qtd_garrafa_p = Integer.parseInt(s_qtd_garrafa_p);
        qtd_garrafa_g = Integer.parseInt(s_qtd_garrafa_g);

        litros = (qtd_lata * 350 + qtd_garrafa_p * 600 + qtd_garrafa_g * 2000);
        litros = litros / 1000;

        JOptionPane.showMessageDialog(null, "Litros no total: " + litros);
    }
}