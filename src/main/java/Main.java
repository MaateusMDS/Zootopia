import model.*;

public class Main {
    public static void main(String[] args) {

        var cachorro = new Cachorro("Rex", 3, 60, 25.5, 4);
        cachorro.comer(90);
        cachorro.moverse(40);
        cachorro.dormir(1);

        System.out.println();

        var elefante = new Elefante("Dumbo", 5, 250, 3000.0, 4);
        elefante.comer(800);
        elefante.moverse(20);
        elefante.dormir(4);

        System.out.println();

        var gato = new Gato("Garfield", 5, 30, 7.2, 4);
        gato.comer(100);
        gato.moverse(5);
        gato.dormir(8);

        System.out.println();

        var leao = new Leao("Simba", 3, 100, 150.5, 4);
        leao.comer(800);
        leao.moverse(30);
        leao.dormir(7);

        System.out.println();

        var peixe = new Peixe("Dory", 1, 15, 0.2);
        peixe.nadar(400);
        peixe.comer(6);
        peixe.dormir(1);

        System.out.println();

        var pombo = new Pombo("Rhino", 2, 20, 0.5, 2, 2, 30);
        pombo.voar(300);
        pombo.comer(60);
        pombo.dormir(1);



    }
}
