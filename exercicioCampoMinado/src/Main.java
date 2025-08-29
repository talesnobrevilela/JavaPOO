import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int campo[][] = new int[2][2];

        int bombaX = rand.nextInt(2);
        int bombaY = rand.nextInt(2);

        campo[bombaX][bombaY] = 1; // 1=bomba

        System.out.println("Bomba: "+ bombaX + " - " +bombaY);

        int posicaoJogadorX;
        int posicaoJogadorY;

        System.out.println("Escolha uma posição para caminhar (linha e coluna entre 0 e 1)");

        for (int i = 0;i<campo.length*2; i++){
            System.out.print("Digite uma posicao X: ");
            posicaoJogadorX = entrada.nextInt();
            System.out.print("Digite uma posicao Y: ");
            posicaoJogadorY = entrada.nextInt();
            if(campo[posicaoJogadorX][posicaoJogadorY] == 1){
                System.out.println("MINA EXPLODIU!");
            }else{
                System.out.println("SEGURO!");
            }
        }
        entrada.close();
    }

}


