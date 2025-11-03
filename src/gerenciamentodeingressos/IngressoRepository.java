package gerenciamentodeingressos;

import com.google.gson.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class IngressoRepository {

    private static final String FILE_PATH = "ingressos.json";

    // Salvar ingresso no arquivo JSON
    public void salvar(Ingresso ingresso) throws IOException {
        List<Ingresso> ingressos = listarTodos();
        ingressos.add(ingresso);
        escreverNoArquivo(ingressos);
    }

    // Ler todos os ingressos do arquivo
    public List<Ingresso> listarTodos() throws IOException {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        String jsonContent = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
        Gson gson = new Gson();
        Ingresso[] ingressosArray = gson.fromJson(jsonContent, Ingresso[].class);
        return new ArrayList<>(Arrays.asList(ingressosArray));
    }

    // Atualizar o status de um ingresso após pagamento
    public void atualizarStatus(String codigo, String novoStatus) throws IOException {
        List<Ingresso> ingressos = listarTodos();
        for (Ingresso ingresso : ingressos) {
            if (ingresso.getCodigo().equals(codigo)) {
                ingresso.setStatus(novoStatus);
                break;
            }
        }
        escreverNoArquivo(ingressos);
    }

    // Escrever a lista de ingressos no arquivo JSON
    private void escreverNoArquivo(List<Ingresso> ingressos) throws IOException {
        Gson gson = new Gson();
        String json = gson.toJson(ingressos);
        Files.write(Paths.get(FILE_PATH), json.getBytes());
    }

    // Verificar disponibilidade de ingressos para um evento
    public boolean verificarDisponibilidade(int idEvento) throws IOException {
        List<Ingresso> ingressos = listarTodos();
        for (Ingresso ingresso : ingressos) {
            if (ingresso.getIdEvento() == idEvento && ingresso.getStatus().equals("DISPONIVEL")) {
                return true;
            }
        }
        return false;
    }
}

