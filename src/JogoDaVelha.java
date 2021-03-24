public class JogoDaVelha {
    private String[] [] t = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};

    public String Exibe(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("    "+ t[i][j]);
            }
            System.out.println("\n");
        }
        return null;
    }

    public boolean isValido(String pos){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (t[i][j].equals(pos))
                    return true;
            }
        }
        return false;
    }

    public void realizaJogada(String pos, String j){
        switch (pos) {
            case "1" -> t[0][0] = j;
            case "2" -> t[0][1] = j;
            case "3" -> t[0][2] = j;
            case "4" -> t[1][0] = j;
            case "5" -> t[1][1] = j;
            case "6" -> t[1][2] = j;
            case "7" -> t[2][0] = j;
            case "8" -> t[2][1] = j;
            case "9" -> t[2][2] = j;
            default -> System.out.println("Opção inválida!");
        }
    }

    public String verificaGanhador(int jogadas){
        String [] vector = new String[8];
        String ganhador = "null";
        if (jogadas == 9){
            ganhador = "Empatado";
        }
        vector[0] = t [0][0] + t [0][1] + t [0][2];
        vector[1] = t [1][0] + t [1][1] + t [1][2];
        vector[2] = t [2][0] + t [2][1] + t [2][2];
        vector[3] = t [0][0] + t [1][0] + t [2][0];
        vector[4] = t [0][1] + t [1][1] + t [2][1];
        vector[5] = t [0][2] + t [1][2] + t [2][2];
        vector[6] = t [0][0] + t [1][1] + t [2][2];
        vector[7] = t [0][2] + t [1][1] + t [2][0];

        for (int i = 0; i < vector.length; i++){
           if (vector[i].equals("XXX")) {
               ganhador = "1";
           }else if (vector[i].equals("OOO")) {
               ganhador = "2";
           }
        }
        return ganhador;
    }
}
