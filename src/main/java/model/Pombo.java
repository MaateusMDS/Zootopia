package model;

import model.types.AnimalAereoAB;

public class Pombo extends AnimalAereoAB {

    public Pombo(String nome, int idade, int altura, double peso, int quantidadePatas, int quantidadeAsas, int envergaduraAsas) {
        super(nome, "pombo", idade, altura, peso, quantidadePatas, quantidadeAsas, envergaduraAsas);
    }

    @Override
    public void comer(int quantidadeComida) {
        super.comer(quantidadeComida);
        System.out.println("O pombo ingeriu " + quantidadeComida + " gramas de comida.");
    }

    @Override
    public void moverse(int distancia) {
        super.moverse(distancia);
        System.out.println("O pombo percorreu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        super.dormir(horas);
        System.out.println("O pombo dormiu por " + horas + " horas.");
    }
}
