public class EstruturaIfElse {
    public static void main(String[] args) {

        int idade = 29;

//        if(idade >= 18){
//            System.out.println("Você é maior de idade ");
//        }
//        else {
//            System.out.println("Você é menor de idade");
//        }
//        boolean estaChovendo = true;
//
//        if(!estaChovendo){
//            System.out.println("Bora passear!");
//        }
//        else{
//            System.out.println("Está chovendo, não pode passerar");
//        }

        boolean temDinheiro = true;
        boolean temCartao = false;
//
//        if (temDinheiro && temCartao){
//            System.out.println("pede um Ifood e um zé delivre");
//        }
//        else if (temDinheiro || temCartao ) {
//            System.out.println("Pede um Ifood");
//        }
//        else{
//            System.out.println("Não pede nada");
//        }

        //operador ternario, olha a expressao como uma pergunta ponto chave olhar o interrogaçação como uma pertunta
        // EX: (temDinheiro ?) se tiver vai ser impresse pede um sushi
        String mensagem = (temDinheiro) ? "pede um sushi" : "Vish sem dinheiro para o sushi";
        System.out.println(mensagem);

    }
}
