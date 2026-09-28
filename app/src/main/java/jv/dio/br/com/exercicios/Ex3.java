package jv.dio.br.com.exercicios;


import java.util.Scanner;

public class Ex3 extends Exercicio {

    private Scanner scanner;
    public Ex3(Scanner scanner) {
        super();
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("3. Escreva um codigo que receba a base e a altura de um retangulo e imprima a area.");
        System.out.println("Digite a base: ");
        int base = this.scanner.nextInt();
        System.out.println("Digite a altura: ");
        int altura = this.scanner.nextInt();
        int area = base * altura;
        System.out.printf("A area do retangulo é %d.\n", area);
    }
    
}
