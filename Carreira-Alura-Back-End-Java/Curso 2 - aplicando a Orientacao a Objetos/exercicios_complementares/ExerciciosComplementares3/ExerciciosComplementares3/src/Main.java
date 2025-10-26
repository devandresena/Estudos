public class Main {
    public static void main(String[] args) {
        //Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
        //Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o
        //menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a
        //na classe principal para definir preços e mostrar informações.
        Carro carro = new Carro();
        carro.setNomeModelo("Corsa");
        carro.setPrecoMedioAno1(26000);
        carro.setPrecoMedioAno2(24000);
        carro.setPrecoMedioAno3(25000);
        carro.menorPreco();
        carro.maiorPreco();

        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.setNomeModelo("Vectra");
        modeloCarro.setPrecoMedioAno1(50000);
        modeloCarro.setPrecoMedioAno2(55000);
        modeloCarro.setPrecoMedioAno3(59000);
        modeloCarro.menorPreco();
        modeloCarro.maiorPreco();

        //Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato,
        //que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override
        //para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada
        //subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
        Animal animal = new Animal();
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        animal.emitirSom();
        gato.emitirSom();
        gato.arranharMoveis();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        //Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e
        //consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
        //Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa
        //mensal da conta corrente.
        ContaBancaria contaBancaria = new ContaBancaria();
        ContaCorrente contaCorrente = new ContaCorrente();

        contaBancaria.depositar(10);
        contaBancaria.sacar(5);
        contaBancaria.consultarSaldo();

        contaCorrente.depositar(1000);
        contaCorrente.sacar(5);
        contaCorrente.consultarSaldo();
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
    }
}
