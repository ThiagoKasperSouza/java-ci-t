package jv.dio.br.com.exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex1 extends Exercicio {
    private Scanner scanner;

    public Ex1(Scanner scanner) {
        super();
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("1. Escreva um codigo que receba um nome e um ano e imprima uma mensagem de boas vindas com o nome e a idade da pessoa.");
        System.out.println("Digite o seu nome: ");
        String nome = this.scanner.next();
        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = this.scanner.nextInt();
        int idade = LocalDate.now().getYear() - anoNascimento;
        System.out.printf("Olá %s, você tem %d anos.\n", nome, idade);
    }
    
}
