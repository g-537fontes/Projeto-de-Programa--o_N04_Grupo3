package gerenciamentodeingressos;

import java.io.IOException;

public class IngressoService {

    public static void main(String[] args) {
        try {
            IngressoRepository repo = new IngressoRepository();

            // Criar um ingresso
            Ingresso ingresso = new Ingresso("VIP123", "VIP", 150.00, "DISPONIVEL", 1, 101);
            repo.salvar(ingresso);

            // Verificar disponibilidade
            if (repo.verificarDisponibilidade(1)) {
                System.out.println("Ingressos disponíveis para o evento!");
            }

            // Atualizar o status do ingresso para "PAGO"
            repo.atualizarStatus("VIP123", "PAGO");
            System.out.println("Status do ingresso atualizado para PAGO!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

