package gestaodeusuario;

public class CadastroComum {

    // Regra 1: email precisa conter "@"
    public boolean validarEmail(String email) {
        return email.contains("@");
    }

    // Regra 2: senha precisa ter pelo menos 6 caracteres
    public boolean validarSenha(String senha) {
        return senha.length() >= 6;
    }

    // Regra 3: usuário comum não pode cadastrar eventos
    public boolean podeCadastrarEvento(boolean isAdmin) {
        return isAdmin; // só administradores podem
    }
}

