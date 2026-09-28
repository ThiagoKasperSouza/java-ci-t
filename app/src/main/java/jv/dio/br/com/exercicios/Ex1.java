package jv.dio.br.com.exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex1 extends Exercicio {
    public Ex1() {
        super();
    }

    @Override
    public void execute() {
        System.out.println("1. Escreva um codigo que receba um nome e um ano e imprima uma mensagem de boas vindas com o nome e a idade da pessoa.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        int idade = LocalDate.now().getYear() - anoNascimento;
        scanner.close();
        System.out.printf("Olá %s, você tem %d anos.\n", nome, idade);
    }
    
}
