
public class Zumbi {
    //ATRIBUTOS
    double vida;
    String nome;

    double mostraVida(){
        return this.vida; // devolve a vida do zumbi escolhido pra transfer
    }

    boolean transfereVida(Zumbi zumbiAlvo,double quantia){
        if(this.vida>quantia){ // verifica se a quantia é maior que a vida do zumbi
            vida-=quantia;
            zumbiAlvo.vida+=quantia;  // retorna true por ser boolean
            return true;
        }
        else{
            System.out.println("Nao é possivel transferir a quantidade " + quantia + " pois a vida é " + this.vida);
            return false;
        }
    }
}


