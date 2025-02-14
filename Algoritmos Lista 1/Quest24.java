import javax.swing.JOptionPane;

public class Quest24 {
    public static void main(String[] args) {
        double litrosRefresco = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros de refresco desejada: "));
        
        if (litrosRefresco < 0) {
            JOptionPane.showMessageDialog(null, "Erro: A quantidade de refresco não pode ser negativa.");
        } else {
            double litrosAgua = litrosRefresco * 0.8;
            double litrosSuco = litrosRefresco * 0.2;
            
            JOptionPane.showMessageDialog(null, "Serão necessários " + litrosAgua + " litros de água e " + litrosSuco + " litros de suco.");
        }
    }
}

/*
programa {
    funcao inicio() {
        real litros_refresco, litros_agua, litros_suco

        escreva("Digite a quantidade de litros de refresco desejada: ")
        leia(litros_refresco)

        se (litros_refresco < 0) {
            escreva("Erro: A quantidade de refresco não pode ser negativa.\n")
        } senao {
            litros_agua = litros_refresco * 0.8
            litros_suco = litros_refresco * 0.2
            escreva("Serão necessários ", litros_agua, " litros de água e ", litros_suco, " litros de suco.\n")
        }
    }
}

| Caso | Quantidade de Litros de Refresco | Resultado Esperado |
| --- | --- | --- |
| 1 | 5 | Serão necessários 4.0 litros de água e 1.0 litros de suco. |
| 2 | 10 | Serão necessários 8.0 litros de água e 2.0 litros de suco. |
| 3 | 0 | Serão necessários 0.0 litros de água e 0.0 litros de suco. |
| 4 | -5 | Erro: A quantidade de refresco não pode ser negativa. |
*/