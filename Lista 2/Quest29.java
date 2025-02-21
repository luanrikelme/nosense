import javax.swing.JOptionPane;

public class Quest29 {

    public static void main(String[] args) {
        // Solicitar ao usuário o caractere
        char caractere = JOptionPane.showInputDialog("Digite um caractere maiúsculo:").charAt(0);

        // Verificar o tipo do caractere
        String mensagem = verificaCaractere(caractere);

        // Exibir a mensagem
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static String verificaCaractere(char caractere) {
        if (Character.isUpperCase(caractere)) {
            return switch (caractere) {
                case 'A', 'E', 'I', 'O', 'U' -> "Vogal";
                default -> "Consoante";
            };
        } else {
            return "Outro";
        }
    }
}