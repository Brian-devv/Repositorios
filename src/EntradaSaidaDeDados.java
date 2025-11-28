import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {

//        System.out.println("olá eu faço impressão e pulo a linha");
//        System.out.print("Olá eu faço a impressão na mesma linnha");
//        System.out.printf("Olá eu faço a impressão formatada");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nome: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Sua idade : " + idade);

        System.out.println("Digite se você está empregado sim ou não: ");
        boolean empregado = scanner.nextBoolean();
        System.out.println("Olá, Sou " + nome + " Tenho " + idade + " anos e estou empregado " + empregado);

    }
}
