package model;

import model.types.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB {

    public Elefante(String nome, int idade, int altura, double peso, int quantidadePatas) {
        super(nome, "elefante", idade, altura, peso, quantidadePatas);
    }

    @Override
    public void comer(int quantidadeComida) {
        super.comer(quantidadeComida);
        System.out.println("O elefante ingeriu " + quantidadeComida + " gramas de comida.");
    }

    @Override
    public void moverse(int distancia) {
        super.moverse(distancia);
        System.out.println("O elefante percorreu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        super.dormir(horas);
        System.out.println("O elefante dormiu por " + horas + " horas.");
    }
}
