import javax.swing.JOptionPane;

public class Quest27 {

    public static void main(String[] args) {
        // Variáveis
        String[] nomes = new String[3];
        int[] idades = new int[3];
        double[] alturas = new double[3];

        // Entrada de dados
        for (int i = 0; i < 3; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nomes[i] + ":"));
            alturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura de " + nomes[i] + " em metros:"));
        }

        // Calcular a altura média
        double alturaMedia = (alturas[0] + alturas[1] + alturas[2]) / 3;

        // Identificar o mais alto e o mais baixo
        int indiceMaisAlto = 0;
        int indiceMaisBaixo = 0;
        for (int i = 1; i < 3; i++) {
            if (alturas[i] > alturas[indiceMaisAlto]) {
                indiceMaisAlto = i;
            }
            if (alturas[i] < alturas[indiceMaisBaixo]) {
                indiceMaisBaixo = i;
            }
        }

        // Identificar o mais velho e o mais moço
        int indiceMaisVelho = 0;
        int indiceMaisNovo = 0;
        for (int i = 1; i < 3; i++) {
            if (idades[i] > idades[indiceMaisVelho]) {
                indiceMaisVelho = i;
            }
            if (idades[i] < idades[indiceMaisNovo]) {
                indiceMaisNovo = i;
            }
        }

        // Exibir as informações
        JOptionPane.showMessageDialog(null, "O mais alto é " + nomes[indiceMaisAlto] + " com " + alturas[indiceMaisAlto] + " metros.");
        JOptionPane.showMessageDialog(null, "O mais baixo é " + nomes[indiceMaisBaixo] + " com " + alturas[indiceMaisBaixo] + " metros.");
        JOptionPane.showMessageDialog(null, "A altura média do grupo é " + alturaMedia + " metros.");
        JOptionPane.showMessageDialog(null, "O mais velho é " + nomes[indiceMaisVelho] + " com " + idades[indiceMaisVelho] + " anos.");
        JOptionPane.showMessageDialog(null, "O mais novo é " + nomes[indiceMaisNovo] + " com " + idades[indiceMaisNovo] + " anos.");
    }
}