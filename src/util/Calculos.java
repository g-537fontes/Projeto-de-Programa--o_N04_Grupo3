package util;

public class Calculos {
    public static double aplicarDesconto(double valor, double percentual) {
        return valor - (valor * percentual / 100);
    }
}

