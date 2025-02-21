import javax.swing.JOptionPane;

public class Quest20 { public static void main(String[] args) { // Solicita o saldo médio ao usuário String input = JOptionPane.showInputDialog("Digite o saldo médio do último ano:");

try {
        double saldoMedio = Double.parseDouble(input);
        double credito;
        
        // Define o valor do crédito com base no saldo médio
        if (saldoMedio < 0) {
            JOptionPane.showMessageDialog(null, "Saldo inválido.");
            return;
        } else if (saldoMedio < 500) {
            credito = 0; // Nenhum crédito concedido
        } else if (saldoMedio < 1000) {
            credito = saldoMedio * 0.3; // 30% do saldo médio
        } else if (saldoMedio < 3000) {
            credito = saldoMedio * 0.4; // 40% do saldo médio
        } else {
            credito = saldoMedio * 0.5; // 50% do saldo médio
        }
        
        // Exibe o resultado
        JOptionPane.showMessageDialog(null, String.format("Saldo Médio: R$ %.2f\nCrédito Concedido: R$ %.2f", saldoMedio, credito));
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número válido.");
    }
}

}