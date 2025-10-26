package gestaodeusuario;

public class CadastroAdministrador extends CadastroComum {

    // Regra: administradores têm acesso total
    public boolean temAcessoCompleto() {
        return true;
    }
}

