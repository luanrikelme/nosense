import javax.swing.JOptionPane;

public class Quest28 {

    public static void main(String[] args) {
        // Solicitar ao usuário o número
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Verificar a característica
        boolean satisfaz = verificaCaracteristica(numero);

        // Exibir o resultado
        if (satisfaz) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " satisfaz a característica.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não satisfaz a característica.");
        }
    }

    public static boolean verificaCaracteristica(int numero) {
        int parte1 = numero / 100; // Primeira parte do número (primeiros dois dígitos)
        int parte2 = numero % 100; // Segunda parte do número (últimos dois dígitos)
        int soma = parte1 + parte2;
        return (soma * soma) == numero;
    }
}