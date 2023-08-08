package model.types;

public abstract class AnimalAB implements AnimalIF {
    private String nome;
    private String tipo;
    private int idade;
    private String habitat;
    private int altura;
    private double peso;
    private int quantComida;
    private int quantCaminho;
    private int quantHorasSono;

    public AnimalAB(String nome, String tipo, int idade, String habitat, int altura, double peso) {
        this.setNome(nome);
        this.setTipo(tipo);
        this.setIdade(idade);
        this.setHabitat(habitat);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setQuantComida(0);
        this.setQuantCaminho(0);
        this.setQuantHorasSono(0);
    }

    public void comer(int quantComida) {
        setQuantComida(getQuantComida() + quantComida);
    }

    public void moverse(int quantCaminho) {
        setQuantCaminho(getQuantCaminho() + quantCaminho);
    }

    public void dormir(int quantHorasSono) {
        setQuantHorasSono(getQuantHorasSono() + quantHorasSono);
    }


    public String getNome() {
        return nome;
    }

    public AnimalAB setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public AnimalAB setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public AnimalAB setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public String getHabitat() {
        return habitat;
    }

    public AnimalAB setHabitat(String habitat) {
        this.habitat = habitat;
        return this;
    }

    public int getAltura() {
        return altura;
    }

    public AnimalAB setAltura(int altura) {
        this.altura = altura;
        return this;
    }

    public double getPeso() {
        return peso;
    }

    public AnimalAB setPeso(double peso) {
        this.peso = peso;
        return this;
    }

    public int getQuantComida() {
        return quantComida;
    }

    public AnimalAB setQuantComida(int quantComida) {
        this.quantComida = quantComida;
        return this;
    }

    public int getQuantCaminho() {
        return quantCaminho;
    }

    public AnimalAB setQuantCaminho(int quantCaminho) {
        this.quantCaminho = quantCaminho;
        return this;
    }

    public int getQuantHorasSono() {
        return quantHorasSono;
    }

    public AnimalAB setQuantHorasSono(int quantHorasSono) {
        this.quantHorasSono = quantHorasSono;
        return this;
    }
}