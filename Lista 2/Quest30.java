import javax.swing.JOptionPane;

public class Quest30 {

    public static void main(String[] args) {
        // Solicitar ao usuário o código do refrigerante
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do refrigerante (1 - Meia-Cola, 2 - Limonax, 3 - Orange):"));

        // Solicitar ao usuário o tipo do refrigerante (N - Normal, D - Diet)
        char tipo = JOptionPane.showInputDialog("Digite o tipo do refrigerante (N - Normal, D - Diet):").charAt(0);

        // Solicitar ao usuário a quantidade do refrigerante
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do refrigerante:"));

        // Determinar o preço com base no código e no tipo
        double preco = 0.0;
        switch (codigo) {
            case 1:
                if (tipo == 'N') {
                    preco = 1.50;
                } else if (tipo == 'D') {
                    preco = 1.70;
                }   break;
            case 2:
                if (tipo == 'N') {
                    preco = 1.60;
                } else if (tipo == 'D') {
                    preco = 1.70;
                }   break;
            case 3:
                if (tipo == 'N') {
                    preco = 1.40;
                } else if (tipo == 'D') {
                    preco = 1.45;
                }   break;
            default:
                break;
        }

        // Calcular o valor total
        double valorTotal = preco * quantidade;

        // Aplicar desconto de 5% se o valor ultrapassar R$100,00
        if (valorTotal > 100.00) {
            valorTotal = valorTotal * 0.95;
        }

        // Exibir o valor total
        JOptionPane.showMessageDialog(null, "O valor total da compra é: R$ " + String.format("%.2f", valorTotal));
    }
}