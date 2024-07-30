package Exemplos;

import Exemplos.Classes.Gato;
import Exemplos.Classes.Cachorro;
import Exemplos.Calculos.Tutor;

public class Principal {
    public static void main(String[] args) {

        Gato tom = new Gato();
        tom.setIdade(2);
        tom.setCorPelos("cinza");
        tom.setNome("Tom");
        tom.setPeso(5.0);
        tom.setCastrado(false);
        tom.miar();
        tom.contraCachorro();

        Cachorro scooby = new Cachorro();
        scooby.setIdade(7);
        scooby.setCorPelos("marrom");
        scooby.setPeso(27.5);
        scooby.setNome("Scooby Do");
        scooby.setAdestrado(true);
        scooby.setPorte("grande");
        scooby.latir();
        scooby.contraCachorro();

        Cachorro caramelo = new Cachorro();
        caramelo.setNome("Chefe Caramelo");
        caramelo.setPeso(1.2);
        caramelo.setCorPelos("Dourado");
        caramelo.setPorte("Peso pena leve");
        caramelo.setAdestrado(false);
        caramelo.setIdade(18);
        caramelo.latir();
        caramelo.contraCachorro();

        Tutor salsicha = new Tutor();
        salsicha.setNome("Salsicha Soares Sadia");
        salsicha.contarPet(scooby.getNome());
        salsicha.contarPet(tom.getNome());
        salsicha.mostrarMeusPets();
    }
}
