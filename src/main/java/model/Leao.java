package model;

import model.types.AnimalTerrestreAB;

public class Leao extends AnimalTerrestreAB {

    public Leao(String nome, int idade, int altura, double peso, int quantidadePatas) {
        super(nome, "leão", idade, altura, peso, quantidadePatas);
    }

    @Override
    public void comer(int quantidadeComida) {
        super.comer(quantidadeComida);
        System.out.println("O leão ingeriu " + quantidadeComida + " gramas de comida.");
    }

    @Override
    public void moverse(int distancia) {
        super.moverse(distancia);
        System.out.println("O leão percorreu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        super.dormir(horas);
        System.out.println("O leão dormiu por " + horas + " horas.");
    }
}
