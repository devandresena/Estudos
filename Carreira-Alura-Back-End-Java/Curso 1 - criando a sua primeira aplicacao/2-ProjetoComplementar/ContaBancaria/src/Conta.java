public class Conta {
    String nome;
    String tipoConta;
    Double saldo;

    public Conta(String nome, String tipoConta, Double saldo) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
