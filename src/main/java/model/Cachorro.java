package model;

import model.types.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {

    public Cachorro(String nome, int idade, int altura, double peso, int quantidadePatas) {
        super(nome, "cachorro", idade, altura, peso, quantidadePatas);
    }

    @Override
    public void comer(int quantidadeComida) {
        super.comer(quantidadeComida);
        System.out.println("O cachorro ingeriu " + quantidadeComida + " gramas de comida.");
    }

    @Override
    public void moverse(int distancia) {
        super.moverse(distancia);
        System.out.println("O cachorro percorreu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        super.dormir(horas);
        System.out.println("O cachorro dormiu por " + horas + " horas.");
    }
}
