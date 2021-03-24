import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        JogoDaVelha novoJogo = new JogoDaVelha();

        String pos;
        int valida = 0, rounds = 0;

        Jogador j1, j2;
        System.out.println("Digite o nome do jogador 1:");
        j1 = new Jogador(ler.next(), 0);
        System.out.println("Digite o nome do jogador 2:");
        j2 = new Jogador(ler.next(), 0);

        while(true){
            System.out.println("Bem vindo ao Jogo da Velha 2.0!");
            novoJogo.Exibe();

            do{
                System.out.print(j1.getNome()+", digite o número da posição escolhida: ");
                pos = ler.next();

                while (!novoJogo.isValido(pos)){
                    System.out.println("Posição inválida! Por favor, escolha outra posição: ");
                    pos = ler.next();
                    valida = 0;
                }
                novoJogo.realizaJogada(pos, "X");
                valida = 1;

            }while(valida == 0);


            rounds++;
            valida = 0;
            novoJogo.Exibe();

            if (!novoJogo.verificaGanhador(rounds).equals("null")){
                break;
            }

            do{
                System.out.print(j2.getNome()+", digite o número da posição escolhida: ");
                pos = ler.next();

                while (!novoJogo.isValido(pos)){
                    System.out.println("POSIÇÃO INVÁLIDA! Por favor, escolha outra posição: ");
                    pos =ler.next();
                    valida = 0;
                }
                novoJogo.realizaJogada(pos, "O");
                valida = 1;

            }while(valida == 0);


            rounds++;
            valida = 0;

            if (!novoJogo.verificaGanhador(rounds).equals("null")){
                break;
            }
        }
        if (novoJogo.verificaGanhador(rounds).equals("1")){
            System.out.println("O(a) jogador(a) "+j1.getNome() + " é o(a) ganhador(a)!");
        }
        else if(novoJogo.verificaGanhador(rounds).equals("2")){
            System.out.println("O(a) jogador(a) "+j2.getNome() + " é o(a) ganhador(a)!");
        }
    }
}

