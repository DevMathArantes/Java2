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
*/
public class Principal {
    public static void main(String[] args) {

        String mensagemMontada;

        PrimeiraClasse meuObjeto = new PrimeiraClasse();
        meuObjeto.exemploString = "Estou criando um atributo de exemplo para o meu objeto!!!";
        meuObjeto.exemploBoolean = true;
        meuObjeto.exemploDouble = 1.25;
        meuObjeto.exemploInt = 10;

        System.out.println(meuObjeto.exemploString +"\n"+ meuObjeto);

        meuObjeto.mostrarObjeto();

        meuObjeto.receberParametro("\n-----Nova frase aqui-----\n");

        System.out.println(meuObjeto.receberRetorno());
    }
}
