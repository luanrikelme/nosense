
import javax.swing.JOptionPane;

public class Quest26 {
    public static void main(String[] args) {
        double a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente angular a1 da primeira reta:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente linear b1 da primeira reta:"));
        double a2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente angular a2 da segunda reta:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente linear b2 da segunda reta:"));

        if (a1 == a2) {
            if (b1 == b2) {
                JOptionPane.showMessageDialog(null, "As retas são coincidentes.");
            } else {
                JOptionPane.showMessageDialog(null, "As retas são paralelas e não se interceptam.");
            }
        } else {
            double x = (b2 - b1) / (a1 - a2);
            double y = a1 * x + b1;
            JOptionPane.showMessageDialog(null, "O ponto de interseção é: (" + x + ", " + y + ")");
        }
    }
}

/*
algoritmo "IntersecaoRetas"
var
    a1, b1, a2, b2, x, y: real

inicio
    // Entrada dos coeficientes das retas
    escreva("Digite o coeficiente angular a1 da primeira reta: ")
    leia(a1)
    escreva("Digite o coeficiente linear b1 da primeira reta: ")
    leia(b1)
    escreva("Digite o coeficiente angular a2 da segunda reta: ")
    leia(a2)
    escreva("Digite o coeficiente linear b2 da segunda reta: ")
    leia(b2)

    // Verificação se as retas são paralelas ou coincidentes
    se a1 = a2 entao
        se b1 = b2 entao
            escreva("As retas são coincidentes.")
        senao
            escreva("As retas são paralelas e não se interceptam.")
        fimse
    senao
        // Cálculo do ponto de interseção
        x := (b2 - b1) / (a1 - a2)
        y := a1 * x + b1
        escreva("O ponto de interseção é: (", x, ", ", y, ")")
    fimse
fimalgoritmo

*/