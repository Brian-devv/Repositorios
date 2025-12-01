import java.util.Scanner;

public class ForFormasGeometricas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------ M E N U ------ ");
        System.out.println("Escolha");
        System.out.println("Arvore   [1] ");
        System.out.println("Quadrado [2]");
        System.out.println("======================");

        System.out.print("Informe sua escolha: ");
        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                for(int linha = 1; linha <= 8; linha++){ // laço externo que controla as linhas de cada iteração
                    // laço interno que controla a quantidade de espaços para centraliar a impressao do caractere
                    for(int espaco = 1; espaco <= 8 - linha; espaco++){
                        System.out.print(" ");
                    }
                    //Laço interno que controla as impressões das estrelas (*) para forma a arvore
                    //laço para fazer com que seja empurrada a estrela para ficarem centralizadas
                    for(int estrela = 1; estrela <= 2 * linha - 1; estrela++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int linha = 1; linha <= 4; linha++){
                    for(int espaco = 1; espaco <= 8; espaco++){
                        System.out.print("#");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.print("Valor Invalido!");
                break;
        }
        scanner.close();
    }
}
