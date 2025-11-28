import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        int contador = 0;
//
//        while(contador < 5){
//            System.out.println(contador);
//            contador ++;
//        }
        int item = 0;
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Desea cadastrar o item? Para continuar Digite [s] para sair[n]: ");
//        String continuar = scanner.nextLine();
        String continuar = "s";
        while(continuar.equals("s")){


            item ++;

            System.out.println("Item cadastrado com Sucesso!");
            System.out.println("Qunatidade de item cadastrados: "+ item);

            System.out.print("Desea cadastrar o item? Para continuar Digite [s] para sair[n]: ");
            continuar = scanner.nextLine();

        }
        System.out.println("O total de Itens cadastro foi: " + item);
        // Usando o While é sempre bom que o controle de continuar ou sair fique dentro do while não fora
        //para não ter repetição de codigo. ou seja crie uma variavel fora do while para ela executar
        //ex: String continuar = 's' isso garante que já vai entrar
    }
}
