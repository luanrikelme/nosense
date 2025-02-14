package Quest22;
// 22) 
import javax.swing.JOptionPane;
public class Quest22{
    public static void main(String[] args) {
        int qtd1, qtd5, qtd10, qtd25, qtd50, qtd100;
        double reais;
        String s_qtd1, s_qtd5, s_qtd10, s_qtd25, s_qtd50, s_qtd100;

        s_qtd1 = JOptionPane.showInputDialog(null, "Quantas moedas de 1 centavo você tem?");
        s_qtd5 = JOptionPane.showInputDialog(null, "Quantas moedas de 5 centavos você tem?");
        s_qtd10 = JOptionPane.showInputDialog(null, "Quantas moedas de 10 centavos você tem?");
        s_qtd25 = JOptionPane.showInputDialog(null, "Quantas moedas de 25 centavos você tem?");
        s_qtd50 = JOptionPane.showInputDialog(null, "Quantas moedas de 50 centavos você tem?");
        s_qtd100 = JOptionPane.showInputDialog(null, "Quantas moedas de 1 real você tem?");
        qtd1 = Integer.parseInt(s_qtd1);
        qtd5 = Integer.parseInt(s_qtd5);
        qtd10 = Integer.parseInt(s_qtd10);
        qtd25 = Integer.parseInt(s_qtd25);
        qtd50 = Integer.parseInt(s_qtd50);
        qtd100 = Integer.parseInt(s_qtd100);

        reais = qtd1 + qtd5 * 5 + qtd10 * 10 + qtd25 * 25 + qtd50 * 50 + qtd100 * 100;
        reais = reais / 100;
    
        JOptionPane.showMessageDialog(null, "Total de reais: " + reais);
    }
}

/*
programa {
    funcao inicio() {
        inteiro moedas_1, moedas_5, moedas_10, moedas_25, moedas_50, moedas_1real
        real total_reais

        escreva("Digite a quantidade de moedas de 1 centavo: ")
        leia(moedas_1)
        escreva("Digite a quantidade de moedas de 5 centavos: ")
        leia(moedas_5)
        escreva("Digite a quantidade de moedas de 10 centavos: ")
        leia(moedas_10)
        escreva("Digite a quantidade de moedas de 25 centavos: ")
        leia(moedas_25)
        escreva("Digite a quantidade de moedas de 50 centavos: ")
        leia(moedas_50)
        escreva("Digite a quantidade de moedas de 1 real: ")
        leia(moedas_1real)

        se (moedas_1 < 0 ou moedas_5 < 0 ou moedas_10 < 0 ou moedas_25 < 0 ou moedas_50 < 0 ou moedas_1real < 0) {
            escreva("Erro: A quantidade de moedas não pode ser negativa.\n")
        } senao {
            total_reais = (moedas_1 * 0.01) + (moedas_5 * 0.05) + (moedas_10 * 0.10) + (moedas_25 * 0.25) + (moedas_50 * 0.50) + (moedas_1real * 1.0)
            escreva("Total economizado: R$", total_reais, "\n")
        }
    }
}

| Caso | Qtd 1 centavo | Qtd 5 centavos | Qtd 10 centavos | Qtd 25 centavos | Qtd 50 centavos | Qtd 1 real | Resultado Esperado |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | 10 | 2 | 1 | 1 | 0 | 0 | 1.35 reais |
| 2 | 0 | 5 | 0 | 0 | 1 | 0 | 2.50 reais |
| 3 | 0 | 0 | 10 | 0 | 0 | 1 | 2.00 reais |
| 4 | 50 | 0 | 0 | 2 | 0 | 0 | 1.00 real |

*/