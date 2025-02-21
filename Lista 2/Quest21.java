import javax.swing.JOptionPane;

public class Quest21 {
    public static void main(String[] args) {
        double salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário atual:"));
        int codigoCargo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cargo:"));

        double aumento = 0;

        switch (codigoCargo) {
            case 101:
                aumento = 0.10;
                break;
            case 102:
                aumento = 0.15;
                break;
            case 103:
                aumento = 0.20;
                break;
            default:
                aumento = 0.355;
                break;
        }

        double aumentoSalarial = salarioAtual * aumento;
        double novoSalario = salarioAtual + aumentoSalarial;

        JOptionPane.showMessageDialog(null, "Salário atual: R$" + salarioAtual + "\nNovo salário: R$" + novoSalario + "\nDiferença: R$" + aumentoSalarial);
    }
}


/*
algoritmo AumentoSalarial
var
    salario_atual, aumento_salarial, novo_salario : real
    codigo_cargo : inteiro
inicio
    escreva("Digite o salário atual: ")
    leia(salario_atual)
    
    escreva("Digite o código do cargo: ")
    leia(codigo_cargo)
    
    caso codigo_cargo de
        101: aumento_salarial := salario_atual * 0.10
        102: aumento_salarial := salario_atual * 0.15
        103: aumento_salarial := salario_atual * 0.20
        outro: aumento_salarial := salario_atual * 0.355
    fim_caso
    
    novo_salario := salario_atual + aumento_salarial
    
    escreva("Salário atual: R$", salario_atual)
    escreva("Novo salário: R$", novo_salario)
    escreva("Diferença: R$", aumento_salarial)
fim
*/

