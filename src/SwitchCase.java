public class SwitchCase {
    public static void main(String[] args) {
        int diaDaSemana = 2;
        switch (diaDaSemana){
            case 1:
                System.out.println("Segunda - Feira");
                break;
            case 2:
                System.out.println("Terça - Feira");
                break;
            case 3:
                System.out.println("Quarta - Ferira");
                break;
            case 4:
                System.out.println("Quinta - Feira");
                break;
            case 5:
                System.out.println("Sexta - Feira");
                break;
            default:
                System.out.println("É final de semana, dia de folga");
                break;
        }
    }
}
