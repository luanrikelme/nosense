
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Quest30 {
    public static void main(String[] args) {
        int grandes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de projetos de grande porte:"));
        int medios = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de projetos de médio porte:"));
        int pequenos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de projetos de pequeno porte:"));
        int anos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de anos na empresa:"));

        int totalPontos = (grandes * 10) + (medios * 5) + (pequenos * 2) + (anos * 2);

        JOptionPane.showMessageDialog(null, "Total de pontos acumulados: " + totalPontos);
    }
}

/*
programa {
    funcao inicio() {
        inteiro projetos_grande, projetos_medio, projetos_pequeno, tempo_empresa, total_pontos

        escreva("Digite a quantidade de projetos de grande porte: ")
        leia(projetos_grande)
        escreva("Digite a quantidade de projetos de médio porte: ")
        leia(projetos_medio)
        escreva("Digite a quantidade de projetos de pequeno porte: ")
        leia(projetos_pequeno)
        escreva("Digite o tempo de empresa (em anos): ")
        leia(tempo_empresa)

        se (projetos_grande < 0 ou projetos_medio < 0 ou projetos_pequeno < 0 ou tempo_empresa < 0) {
            escreva("Erro: A quantidade de projetos ou tempo de empresa não pode ser negativa.\n")
        } senao {
            total_pontos = (projetos_grande * 10) + (projetos_medio * 5) + (projetos_pequeno * 2) + (tempo_empresa * 2)
            escreva("Total de pontos acumulados: ", total_pontos, "\n")
        }
    }
}

| Caso | Projetos Grandes | Projetos Médios | Projetos Pequenos | Anos na Empresa | Resultado Esperado |
| --- | --- | --- | --- | --- | --- |
| 1 | 2 | 3 | 4 | 5 | Total de pontos acumulados: 52 |
| 2 | 1 | 2 | 3 | 10 | Total de pontos acumulados: 38 |
| 3 | 0 | 0 | 0 | 5 | Total de pontos acumulados: 10 |
| 4 | -1 | 2 | 3 | 5 | Erro (não é possível ter projetos negativos) |
| 5 | 2 | -3 | 4 | 5 | Erro (não é possível ter projetos negativos) |
*/