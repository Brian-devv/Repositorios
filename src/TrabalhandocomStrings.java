public class TrabalhandocomStrings {
    public static void main(String[] args) {
        String nome = "Jones";
        String nomeDois = "Sabrina";

        int tamanhoNome = nome.length();
        boolean saoIguais = nome.equals(nomeDois);


        System.out.println("Olá " + nome.toUpperCase() + " Seu nome tem " + tamanhoNome + " Caracteres");
        System.out.println("Os nomes são iguais ? " + saoIguais);

    }
}
