package jv.dio.br.com.exercicios;

import java.util.Scanner;

public class Ex2 extends Exercicio {
    private Scanner scanner;

    public Ex2(Scanner scanner) {
        super();
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("2. Escreva um codigo que receba o tamanho do lado de um quadrado e imprima a area.");
        System.out.println("Digite o tamanho do lado: ");
        int lado = this.scanner.nextInt();
        int area = lado * lado;
        System.out.printf("A area do quadrado é %d.\n", area);
    }

}