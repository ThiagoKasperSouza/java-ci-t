package jv.dio.br.com;

import java.util.Scanner;

public class Aula1 implements jv.dio.br.com.Aula {
    private String getGreeting() {
        return GREETING;
    }
    
    private static final String GREETING = "Hello World!";
    private static final String NAME = "Digite o seu nome: ";
    private static final String AGE = "Digite sua idade: ";

    public Aula1() { }

    @Override 
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new Aula1().getGreeting());
        System.out.println(NAME);
        String nome = scanner.nextLine();
        System.out.println(AGE);
        int idade = scanner.nextInt();
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
        System.out.printf("Olá %s, sua idade é %d anos.\n", nome, idade);
        scanner.close();
    }
}
