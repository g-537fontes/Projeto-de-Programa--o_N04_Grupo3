package gerenciamentodeingressos;

public class CompraDeIngresso {

    // Regra 1: o cliente não pode comprar mais de 4 ingressos
    public boolean validarLimiteIngressos(int quantidade) {
        return quantidade <= 4;
    }

    // Regra 2: meia entrada paga metade do preço
    public double calcularPrecoFinal(double precoBase, boolean meiaEntrada) {
        if (meiaEntrada) {
            return precoBase / 2;
        } else {
            return precoBase;
        }
    }

    // Regra 3: ingresso VIP tem taxa extra de 20%
    public double aplicarTaxaVip(double preco, boolean vip) {
        if (vip) {
            return preco * 1.2;
        } else {
            return preco;
        }
    }
}

