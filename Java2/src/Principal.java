/*
Criando um objeto
requisitos: tenha uma classe criada
X NOME_OBJETO = new X();
X= nome da classe, sendo o primeiro X para criar a variável e o segundo para referência-lo

    Atribuindo
    requisitos: tenha os atributos ou métodos da classe já criados nela

    para atributos
    X.Y = Z;

    para métodos
    X.N();

    X= nome do objeto
    Y= nome do atributo
    Z = valor
    N = nome de um método

O comando CTRL + ALT + I identa o código

Em java, String não é um tipo primitivo e sim uma classe, com atributos e métodos

Documentação Java
https://docs.oracle.com/en/java/
https://docs.oracle.com/en/java/javase/19/docs/api/index.html
https://docs.oracle.com/en/java/javase/17/docs/api/index.html

*/

import PacoteClasses.PrimeiraClasse;

public class Principal {
    public static void main(String[] args) {

        PrimeiraClasse meuObjeto = new PrimeiraClasse();
        meuObjeto.setExemploString("Estou criando um atributo de exemplo para o meu objeto!!!");
        meuObjeto.setExemploBoolean(true);
        meuObjeto.setExemploDouble(1.25);
        meuObjeto.setExemploInt(100);

        meuObjeto.mostrarObjeto();

        meuObjeto.receberParametro("\n-----Nova frase aqui-----\n");

        System.out.println(meuObjeto.receberRetorno());
        System.out.println("Valor secreto: "+meuObjeto.getValorSecreto());

    }
}
