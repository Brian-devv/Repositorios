public class For {
    public static void main(String[] args) {

        //int contador = 1;

//        for(int i = 1; i < 10; i ++){
//            System.out.println("--- Tabudada do " + i + "---");
//           for(int j = 1; j < 10; j ++){
//                System.out.println(i+" x " + j + " = " + (i * j));
//
//           }
//
//        }
        int altura = 8;
        for (int i = 1; i <= altura; i++) {
            for (int espaco = 1; espaco <= altura - i; espaco++) {
                System.out.print(".");
            }
            for (int estrela = 1; estrela <= 2 * i - 1; estrela++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
