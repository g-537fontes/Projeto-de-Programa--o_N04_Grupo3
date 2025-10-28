package main;

import cadastroevento.CadastrarEvento;
import gestaodeusuario.CadastroAdministrador;
import gestaodeusuario.CadastroComum;
import gerenciamentodeingressos.CompraDeIngresso;
import historicoserelatorios.RelatorioDeVendasEvento;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciando as classes principais
        CadastrarEvento evento = new CadastrarEvento();
        CadastroComum usuario = new CadastroComum();
        CadastroAdministrador cadastroAdm = new CadastroAdministrador();
        CompraDeIngresso compra = new CompraDeIngresso();
        RelatorioDeVendasEvento relatorio = new RelatorioDeVendasEvento();

        int opcao;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Cadastrar Evento");
            System.out.println("2 - Cadastrar Usuário");
            System.out.println("3 - Comprar Ingresso");
            System.out.println("4 - Gerar Relatório de Vendas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastro de Evento ---");
                    evento.cadastrarEvento();
                    break;

                case 2:
                    System.out.println("\n--- Cadastro de Usuário ---");
                    System.out.println("Você deseja fazer o cadastro como usuario ou administrador? ");
                    System.out.println("1- Usuario: ");
                    System.out.println("2- Administrador: ");
                    int escolhaUsuario = scanner.nextInt();
                    if (escolhaUsuario == 1) {
                        usuario.cadastrarUsuario();
                    } else if (escolhaUsuario == 2) {
                        cadastroAdm.cadastrarAdministrador();
                    }
                    break;

                case 3:
                    System.out.println("\n--- Compra de Ingresso ---");
                    compra.realizarCompra();
                    break;

                case 4:
                    System.out.println("\n--- Relatório de Vendas ---");
                    relatorio.gerarRelatorio(true);
                    break;

                case 0:
                    System.out.println("\nEncerrando o sistema...");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
