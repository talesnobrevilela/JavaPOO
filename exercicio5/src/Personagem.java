public class Personagem {

    String nome;
    int pontos;
    Arma arma;

    void usarArma() {
        if(arma!= null && arma.resistencia > 0){
            System.out.println( nome + " usou a arma " + arma.nome);
            arma.resistencia -= 2;
        }
        else{
            System.out.println(nome+ " nao pode usar a arma ");
        }
    }
    void tomarDano(){
        pontos -= 5;
        if(pontos > 0){
            System.out.println( nome + " tomou dano. Vida atual: " + pontos);
        }
    }

}
