package model.types;

public abstract class AnimalAereoAB extends AnimalAB {

    private int quantidadePatas;
    private int quantidadeAsas;
    private int envergaduraAsas;

    public AnimalAereoAB(String nome, String tipo, int idade, int altura, double peso, int quantidadePatas, int quantidadeAsas, int envergaduraAsas) {
        super(nome, tipo, idade, "aéreo", altura, peso);
        this.quantidadePatas = quantidadePatas;
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsas = envergaduraAsas;
    }

    public int getQuantidadeAsas() {
        return quantidadeAsas;
    }

    public AnimalAereoAB setQuantidadeAsas(int quantidadeAsas) {
        this.quantidadeAsas = quantidadeAsas;
        return this;
    }

    public int getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public AnimalAereoAB setEnvergaduraAsas(int envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
        return this;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public AnimalAereoAB setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
        return this;
    }

    public void voar(int distancia) {
        this.moverse(distancia);
        System.out.println(getNome() + " voou " + distancia + " metros.");
    }
}
