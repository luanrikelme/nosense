/*
// Algoritmo para prática do método chinês
Variáveis
    X, Y, Z: inteiro;

Início
    X <- 10;
    Y <- 12;
    Z <- X - Y;
    X <- X + 8;

    se Y > X então
        se Z < X então
            Z <- Y - X;
        senão
            Z <- X;
        fimse
    senão
        se Y = X então
            Y <- Z;
        senão
            Y <- Y + 1;
        fimse
    fimse

    escrever "O valor de X é ", X;
    escrever "O valor de Y é ", Y;
    escrever "O valor de Z é ", Z;
Fim
*/
