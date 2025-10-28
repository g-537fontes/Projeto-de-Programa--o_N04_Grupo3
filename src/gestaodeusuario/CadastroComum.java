package gestaodeusuario;

import java.util.Scanner;

public class CadastroComum {
    // Atributos privados
    private String nomeCompleto;
    private String email;
    private String senha;

    // Getters e Setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Regras de validação
    public boolean validarEmail(String email) {
        return email.contains("@");
    }

    public boolean validarSenha(String senha) {
        return senha.length() >= 6;
    }

    // Cadastro de usuário comum
    public void cadastrarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        setNomeCompleto(scanner.nextLine());

        System.out.println("Informe seu e-mail: ");
        setEmail(scanner.nextLine());

        System.out.println("Crie uma senha com no mínimo 6 caracteres: ");
        setSenha(scanner.nextLine());

        boolean emailValido = validarEmail(getEmail());
        boolean senhaValida = validarSenha(getSenha());

        if (emailValido && senhaValida) {
            System.out.println("\nUsuário cadastrado com sucesso!");
            System.out.println("Nome: " + getNomeCompleto());
            System.out.println("E-mail: " + getEmail());
        } else {
            System.out.println("\nErro no cadastro:");
            if (!emailValido) {
                System.out.println("E-mail inválido (deve conter '@').");
            }
            if (!senhaValida) {
                System.out.println("Senha inválida (mínimo 6 caracteres).");
            }
        }
    }
}
