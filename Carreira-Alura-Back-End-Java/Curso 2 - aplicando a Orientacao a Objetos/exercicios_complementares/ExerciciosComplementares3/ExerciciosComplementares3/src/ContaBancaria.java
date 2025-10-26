public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Valor depositado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Não é possivel depositar valor negativo");
        }
    }

    public void sacar(double valor) {
        if (saldo >= valor && valor > 0){
            saldo -= valor;
            System.out.println("O valor foi sacado. Saldo atual: R$" + saldo);
        }else {
            System.out.println("Não foi possivel realizar operação, saldo é menor que o valor do saque ou o valor do saque é menor que 0");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: R$" + saldo);
    }
}
