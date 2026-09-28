package jv.dio.br.com;

public class Aula2 implements Aula {
    public Aula2() {
    }

    @Override
    public void execute() {
         //https://www.dio.me/articles/java-tipos-primitivos
        System.out.printf("TIPOS PRIMITIVOS: \n");
        System.out.printf("byte: %d\n", (byte) 5);
        System.out.printf("short: %d\n", (short) 5);
        System.out.printf("int: %d\n", 5);
        System.out.printf("float: %f\n", 5.0f);
        System.out.printf("long: %d\n", 5L);
        System.out.printf("double: %f\n", 5.0);
        System.out.printf("char: %c\n", 'A');
        System.out.printf("boolean: %b\n", true);
    }
    
}
