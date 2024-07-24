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

*/

public class PrimeiraClasse {
    String exemploString;
    int exemploInt;
    boolean exemploBoolean;
    double exemploDouble;

    void mostrarObjeto(){
        System.out.println("\n\n"+exemploString +"\n"+exemploInt+"\n"+exemploDouble+"\n"+exemploBoolean+"\n\n");
    }
    void receberParametro( String parametro){
        exemploString += parametro;
        System.out.println(exemploString);
    }
    double receberRetorno(){
        return exemploInt * exemploDouble;
    }
}
