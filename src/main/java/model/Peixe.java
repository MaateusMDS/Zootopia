package model;

import model.types.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {

    public Peixe(String nome, int idade, int altura, double peso) {
        super(nome, "peixe", idade, altura, peso);
    }

    @Override
    public void comer(int quantidadeComida) {
        super.comer(quantidadeComida);
        System.out.println("O peixe ingeriu " + quantidadeComida + " gramas de comida.");
    }

    @Override
    public void moverse(int distancia) {
        super.moverse(distancia);
        System.out.println("O peixe percorreu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        super.dormir(horas);
        System.out.println("O peixe dormiu por " + horas + " horas.");
    }

    public void nadar(int distancia) {
        moverse(distancia);
        System.out.println(" O peixe nadou " + distancia + " metros.");
    }
}
