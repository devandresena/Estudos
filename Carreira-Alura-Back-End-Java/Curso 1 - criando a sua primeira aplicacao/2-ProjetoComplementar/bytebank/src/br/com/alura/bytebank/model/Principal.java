package br.com.alura.bytebank.model;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        double valor = 1;

        System.out.println("Bem vindo ao ByteBank");

        Funcionario jose = new Funcionario("José", 1, LocalDate.of(1990, 2, 12));

        System.out.println(jose);
    }
}