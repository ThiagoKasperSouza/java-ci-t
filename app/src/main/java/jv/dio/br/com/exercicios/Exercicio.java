package jv.dio.br.com.exercicios;

import jv.dio.br.com.aulas.Aula;

public class Exercicio implements Aula {
    public Exercicio() {
    }

    @Override
    public void execute() {
        System.out.println("Executando o exercício");
    }
    
}
