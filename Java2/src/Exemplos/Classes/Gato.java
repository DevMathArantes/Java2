package Exemplos.Classes;
public class Gato extends Animal{

    private boolean castrado;

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
    public boolean isCastrado() {
        return castrado;
    }
    public void miar(){
        if(acesso()){
            System.out.println(getNome()+": MIAAAAAAUUUUUUUUU!!!!\n");
        }
        else{
            System.out.println("...");
        }
    }
}
