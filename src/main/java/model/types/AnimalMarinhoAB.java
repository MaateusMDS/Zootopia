package model.types;

public abstract class AnimalMarinhoAB extends AnimalAB {
    public AnimalMarinhoAB(String nome, String tipo, int idade, int altura, double peso) {
        super(nome, tipo, idade, "marinho", altura, peso);
    }
}
