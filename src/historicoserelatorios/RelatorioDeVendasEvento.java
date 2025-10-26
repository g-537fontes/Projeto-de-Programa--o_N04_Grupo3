package historicoserelatorios;

public class RelatorioDeVendasEvento {

    // Regra: relatório deve mostrar apenas eventos finalizados
    public void gerarRelatorio(boolean eventoFinalizado) {
        if (!eventoFinalizado) {
            System.out.println("O evento ainda não terminou. Relatório indisponível.");
        } else {
            System.out.println("Gerando relatório de vendas...");
        }
    }

    // Regra: histórico não deve incluir eventos cancelados
    public void exibirHistorico(boolean eventoCancelado) {
        if (eventoCancelado) {
            System.out.println("Evento cancelado. Histórico oculto.");
        } else {
            System.out.println("Exibindo histórico de vendas...");
        }
    }
}

