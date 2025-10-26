import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Cria um novo cartão
        CartaoCredito cartaoAndre = new CartaoCredito();

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        cartaoAndre.setLimite(leitura.nextDouble());

        //consome enter que foi dado, para que isso não atrapalhe na leitura da sting a seguir
        leitura.nextLine();

        boolean temCompra = true;
        String descricao;
        double valorCompra;
        int continuarCompras;

        while (temCompra == true){
            System.out.println("Digite a descrição da compra:");
            descricao = leitura.nextLine();
            System.out.println("Digite o valor da compra");
            valorCompra = leitura.nextDouble();

            //Captura enter
            leitura.nextLine();
            if (cartaoAndre.realizarCompra(descricao, valorCompra)){
                System.out.println("Digite 0 para sair ou 1 para continuar:");
                continuarCompras = leitura.nextInt();

                //Captura enter
                leitura.nextLine();

                if (continuarCompras == 0){
                    cartaoAndre.extratoCartao();
                    temCompra = false;
                }
            } else {
                temCompra = false;
            }
        }
    }
}
