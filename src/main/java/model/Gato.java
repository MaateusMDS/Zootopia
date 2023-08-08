package model;

import model.types.AnimalTerrestreAB;

public class Gato extends AnimalTerrestreAB {

    public Gato(String nome, int idade, int altura, double peso, int quantidadePatas) {
        super(nome, "gato", idade, altura, peso, quantidadePatas);
    }

    @Override
    public void comer(int quantidadeComida) {
        super.comer(quantidadeComida);
        System.out.println("O gato ingeriu " + quantidadeComida + " gramas de comida.");
    }

    @Override
    public void moverse(int distancia) {
        super.moverse(distancia);
        System.out.println("O gato percorreu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        super.dormir(horas);
        System.out.println("O gato dormiu por " + horas + " horas.");
    }
}
