package jv.dio.br.com.exercicios;

import java.util.Scanner;

public class Ex4 extends Exercicio {

    private Scanner scanner;

    public Ex4(Scanner scanner) {
        super();
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("4. Escreva o nome e idade de 2 pessoas e imprima a diferenca de idade.");
        System.out.println("Digite o nome da primeira pessoa: ");
        String nome1 = this.scanner.next();
        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = this.scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = this.scanner.next();
        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = this.scanner.nextInt();
        int diferenca = Math.abs(idade1 - idade2);
        System.out.printf("A diferenca de idade entere %s e %s é %d.\n", nome1, nome2, diferenca);
    }
    
}
