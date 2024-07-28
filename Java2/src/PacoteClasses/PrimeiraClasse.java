/*
Classes costumam guardar atributos em comum entre objetos

Tipos de métodos
métodos construtores: são responsáveis por inicializar os objetos
métodos de acesso: permitem acessar e modificar os atributos de um objeto


Quando os métodos não retornam um valor, utiliza-se o void, quando retornam, utiliza-se o tipo do retorno
TIPO NOME_MÉTODO(){...INSTRUÇÕES...}

    Utilizando parâmetro
    TIPO NOME(X PARÂMETRO){...intruções (chame pelo nome do parâmetro para utiliza-lo)...}
    X= tipo do parâmetro

    Retornar valor
    return X;
    O return deve ser dado dentro do método e retornará X;

Modificadores de acesso/visibilidade

VISIBILIDADE TIPO NOME;

private: não pode ser vista nem utilizada em outras classes
Podemos criar uma função get para utilizar essa variável, por exemplo: int getX(){ return x;}
use ALT + INSERT, vá em "generate" para ver opções getters e setters

    getter
    public int getY(){
        return y;
    }
    Utiliza-se esta função para retornar um valor y privado pela função getY()

    setter
    public void setY(X Y) {
        this.Y = Y;
    }
    Obs: Y= atributo, X= tipo
    Assim, ao criar o objeto, ela poderá ser chamada por N.setY(Z), onde N = objeto, Y = atributo e Z = valor


public: é visível e utilizavel em qualquer pacote do projeto

default: não específica nenhuma visibilidade, portanto pode ser acessado pelas classes de mesmo pacote

*/
package PacoteClasses;

public class PrimeiraClasse {
    private String exemploString;
    private int exemploInt;
    private boolean exemploBoolean;
    private double exemploDouble;
    private int valorSecreto = 6457;

    public void setExemploString(String exemploString) {
        this.exemploString = exemploString;
    }
    public void setExemploInt(int exemploInt) {
        this.exemploInt = exemploInt;
    }
    public void setExemploBoolean(boolean exemploBoolean) {
        this.exemploBoolean = exemploBoolean;
    }
    public void setExemploDouble(double exemploDouble) {
        this.exemploDouble = exemploDouble;
    }

    public int getValorSecreto(){
        return valorSecreto;
    }
    public void mostrarObjeto(){
        System.out.println("\n\n"+exemploString +"\n"+exemploInt+"\n"+exemploDouble+"\n"+exemploBoolean+"\n\n");
    }
    public void receberParametro( String parametro){
        exemploString += parametro;
        System.out.println(exemploString);
    }
    public double receberRetorno(){
        return exemploInt * exemploDouble;
    }
}
