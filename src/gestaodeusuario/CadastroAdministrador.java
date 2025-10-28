package gestaodeusuario;

import java.util.Scanner;

public class CadastroAdministrador extends CadastroComum {
    private String cpf;

    // Getter e Setter de CPF
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Validação de CPF
    public boolean validarCpf(String cpf) {
        return cpf.matches("\\d{11}"); // tem q ter no minim 11 digitos
    }

    // Cadastro de administrador
    public void cadastrarAdministrador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        setNomeCompleto(scanner.nextLine());

        System.out.println("Informe seu CPF (somente números): ");
        setCpf(scanner.nextLine());

        System.out.println("Informe seu e-mail: ");
        setEmail(scanner.nextLine());

        System.out.println("Crie uma senha com no mínimo 6 caracteres: ");
        setSenha(scanner.nextLine());

        boolean cpfValido = validarCpf(getCpf());
        boolean emailValido = validarEmail(getEmail());
        boolean senhaValida = validarSenha(getSenha());

        if (cpfValido && emailValido && senhaValida) {
            System.out.println("\nAdministrador cadastrado com sucesso!");
            System.out.println("Nome: " + getNomeCompleto());
            System.out.println("CPF: " + getCpf());
            System.out.println("E-mail: " + getEmail());
        } else {
            System.out.println("\nErro no cadastro:");
            if (!cpfValido) {
                System.out.println("CPF inválido (deve conter 11 números).");
            }
            if (!emailValido) {
                System.out.println("E-mail inválido (deve conter '@').");
            }
            if (!senhaValida) {
                System.out.println("Senha inválida (mínimo 6 caracteres).");
            }
        }
    }

    // Método exclusivo do administrador
    public boolean temAcessoTodoOEvento() {
        return true;
    }
}
