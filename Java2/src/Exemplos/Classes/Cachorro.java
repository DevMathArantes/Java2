package Exemplos.Classes;
public class Cachorro extends Animal{

    private String porte;
    private boolean adestrado;

    public void setPorte(String porte) {
        this.porte = porte;
    }
    public void setAdestrado(boolean adestrado) {
        this.adestrado = adestrado;
    }
    public String getPorte() {
        return porte;
    }
    public boolean isAdestrado() {
        return adestrado;
    }

    public void latir(){
        if(acesso()){
            System.out.println(getNome()+": au au aua !!!\n");
        }
        else{
            System.out.println("...");
        }
    }

    @Override
    public void contraCachorro(){
        System.out.println("Eu sou um cachorro");
    }

}
