package jv.dio.br.com.aulas;

import java.util.Scanner;

public class Aula1 implements jv.dio.br.com.aulas.Aula {
    private Scanner scanner;

    private String getGreeting() {
        return GREETING;
    }
    
    private static final String GREETING = "Hello World!";
    private static final String NAME = "Digite o seu nome: ";
    private static final String AGE = "Digite sua idade: ";

    public Aula1(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override 
    public void execute() {
        System.out.println(getGreeting());
        System.out.println(NAME);
        String nome = this.scanner.nextLine();
        System.out.println(AGE);
        int idade = this.scanner.nextInt();
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
        System.out.printf("Olá %s, sua idade é %d anos.\n", nome, idade);
    }
}
