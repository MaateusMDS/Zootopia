package model.types;

public abstract class AnimalTerrestreAB extends AnimalAB {

    private int quantidadePatas;

    public AnimalTerrestreAB(String nome, String tipo, int idade, int altura, double peso, int quantidadePatas) {
        super(nome,tipo, idade, "terrestre", altura, peso);
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public AnimalTerrestreAB setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
        return this;
    }
}
