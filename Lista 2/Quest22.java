import javax.swing.JOptionPane;

public class Quest22 {
    public static void main(String[] args) {
        // Entrada de dados usando JOptionPane
        int idAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de identificação do aluno:"));
        
        double X1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double X2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double X3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
        double ME = Double.parseDouble(JOptionPane.showInputDialog("Digite a média dos exercícios:"));

        // Cálculo da média de aproveitamento
        double MA = (X1 + 2 * X2 + 3 * X3 + ME) / 7;

        // Determinação do conceito
        String conceito;
        if (MA >= 9.0) {
            conceito = "A";
        } else if (MA >= 7.5) {
            conceito = "B";
        } else if (MA >= 6.0) {
            conceito = "C";
        } else if (MA >= 4.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        // Verificação de aprovação ou reprovação
        String status = (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) ? "APROVADO" : "REPROVADO";

        // Exibição dos resultados
        String resultado = "Número do aluno: " + idAluno + "\n"
                         + "Notas: " + X1 + ", " + X2 + ", " + X3 + "\n"
                         + "Média dos exercícios: " + ME + "\n"
                         + "Média de Aproveitamento: " + String.format("%.2f", MA) + "\n"
                         + "Conceito: " + conceito + "\n"
                         + "Situação: " + status;

        JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}