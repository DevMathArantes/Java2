package Exemplos.Classes;

public class Pessoa {
    private String nome;
    private int idade;
    private Double altura;
    private int senha = 123;

    public int getSenha(){
        return senha;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public void acenar(){
        System.out.println(nome +": Estou acenando!!!");
    }
    public void logar(int entrada){
        if(entrada==senha){
            System.out.println("\nAcesso permitido\n");
        }
        else{
            System.out.println("\nAcesso Negado\n");
        }
    }
}
