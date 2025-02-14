algoritmo "VerificaNumeroEspecial"
var
    numero, parte1, parte2, soma, quadrado: inteiro
    numStr: cadeia

inicio
    // Solicita ao usuário um número
    escreva("Digite um número: ")
    leia(numero)

    // Converte o número para string
    numStr <- inteiroParaString(numero)
    
    // Verifica se tem número par de dígitos
    se (comprimento(numStr) mod 2 <> 0) entao
        escreva("O número não possui um número par de dígitos.")
    senao
        // Divide o número ao meio
        parte1 <- stringParaInteiro(substring(numStr, 0, comprimento(numStr) / 2))
        parte2 <- stringParaInteiro(substring(numStr, comprimento(numStr) / 2, comprimento(numStr)))
        
        // Soma e eleva ao quadrado
        soma <- parte1 + parte2
        quadrado <- soma * soma
        
        // Verifica se a propriedade é atendida
        se (quadrado = numero) entao
            escreva(numero, " possui a propriedade especial.")
        senao
            escreva(numero, " não possui a propriedade especial.")
        fimse
    fimse
fimalgoritmo
/*
programa {
    funcao inicio() {
        real valor_cheque, imposto_cpmf

        escreva("Digite o valor do cheque: ")
        leia(valor_cheque)

        // Verificação de erro para valor negativo
        se (valor_cheque < 0) {
            escreva("Erro: O valor do cheque não pode ser negativo.\n")
        } senao {
            imposto_cpmf = valor_cheque * 0.0038
            escreva("Valor a ser recolhido de CPMF: R$", imposto_cpmf, "\n")
        }
    }
}
*/