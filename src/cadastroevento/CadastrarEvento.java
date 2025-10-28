package cadastroevento;

public class CadastrarEvento {

    
    public boolean validarData(String dataEvento) {
        // Exemplo simples (em um projeto real, você converteria a data)
        return !dataEvento.equals("passado");
    }
    
    public boolean validarNomeEvento(String nomeEvento, String[] nomesExistentes) {
        for (String nome : nomesExistentes) {
            if (nome.equalsIgnoreCase(nomeEvento)) {
                return false;
            }
        }
        return true;
    }

 
    public boolean validarLimiteParticipantes(int maxParticipantes) {
        return maxParticipantes > 0 && maxParticipantes <= 1000;
    }

    public void cadastrarEvento() {

    }
}

