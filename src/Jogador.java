import java.util.Scanner;

public class Jogador {

    private String nome;
    private int pontos;

    public Jogador (String nome, int pontos){
        this.nome = nome;
        this.pontos = pontos;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public void setPontos(int p){
        this.pontos = p;
    }

    public String getNome(){
        return nome;
    }

    public int getPontos(){
        return pontos;
    }

}
