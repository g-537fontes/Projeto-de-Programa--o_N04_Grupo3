package cadastroevento;

public class CadastrarEvento {

    // Regra 1: evento não pode ter data passada
    public boolean validarData(String dataEvento) {
        // Exemplo simples (em um projeto real, você converteria a data)
        return !dataEvento.equals("passado");
    }

    // Regra 2: o nome do evento deve ser único
    public boolean validarNomeEvento(String nomeEvento, String[] nomesExistentes) {
        for (String nome : nomesExistentes) {
            if (nome.equalsIgnoreCase(nomeEvento)) {
                return false;
            }
        }
        return true;
    }

    // Regra 3: número máximo de participantes
    public boolean validarLimiteParticipantes(int maxParticipantes) {
        return maxParticipantes > 0 && maxParticipantes <= 1000;
    }
}

