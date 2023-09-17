package application;
import java.security.SecureRandom;

public class GeradorDeSenha {

    // Caracteres permitidos na senha
    private static final String CARACTERES_PERMITIDOS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";

    // Tamanho padrão da senha
    private static final int TAMANHO_PADRAO = 12;

    public static void main(String[] args) {
        String senha = gerarSenha(TAMANHO_PADRAO);
        System.out.println("Senha gerada: " + senha);
    }

    public static String gerarSenha(int tamanho) {
        StringBuilder senha = new StringBuilder();
        SecureRandom random = new SecureRandom();

        // Loop para gerar caracteres aleatórios
        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(CARACTERES_PERMITIDOS.length());
            char caractere = CARACTERES_PERMITIDOS.charAt(index);
            senha.append(caractere);
        }

        return senha.toString();
    }
}
