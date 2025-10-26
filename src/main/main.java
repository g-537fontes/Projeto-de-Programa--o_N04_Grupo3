package main;

import cadastroevento.CadastrarEvento;
import gestaodeusuario.CadastroComum;
import gerenciamentodeingressos.CompraDeIngresso;
import historicoserelatorios.RelatorioDeVendasEvento;

public class Main {
    public static void main(String[] args) {

        // ---- Regras de evento ----
        CadastrarEvento evento = new CadastrarEvento();
        boolean nomeValido = evento.validarNomeEvento("Show ZN", new String[]{"Show BH", "Festa SP"});
        System.out.println("Nome do evento válido? " + nomeValido);

        // ---- Regras de usuário ----
        CadastroComum usuario = new CadastroComum();
        System.out.println("Email válido? " + usuario.validarEmail("larissa@gmail.com"));
        System.out.println("Senha válida? " + usuario.validarSenha("123456"));

        // ---- Regras de ingressos ----
        CompraDeIngresso compra = new CompraDeIngresso();
        double preco = compra.calcularPrecoFinal(100, true);
        preco = compra.aplicarTaxaVip(preco, true);
        System.out.println("Preço final do ingresso: " + preco);

        // ---- Relatórios ----
        RelatorioDeVendasEvento relatorio = new RelatorioDeVendasEvento();
        relatorio.gerarRelatorio(true);
    }
}


