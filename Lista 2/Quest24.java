
import javax.swing.JOptionPane;

// Entrada de valores
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x:"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y:"));

        // Verifica se o ponto pertence à reta 2x + y = 3
        if (2 * x + y == 3) {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + ", " + y + ") pertence à reta.");
        } else {
            JOptionPane.showMessageDialog(null, "O ponto (" + x + ", " + y + ") NÃO pertence à reta.");
        }
    }
}