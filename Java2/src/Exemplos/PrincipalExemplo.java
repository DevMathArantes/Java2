package Exemplos;

import Exemplos.Classes.Pessoa;
import java.util.Scanner;

public class PrincipalExemplo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Pessoa matheus = new Pessoa();
        matheus.setAltura(1.73);
        matheus.setNome("Matheus Arantes Ferreira");
        matheus.setIdade(20);
        matheus.acenar();

        System.out.print("Digite a senha: ");
        int senha = ler.nextInt();
        matheus.logar(senha);
        System.out.println(matheus.getSenha());
    }
}
