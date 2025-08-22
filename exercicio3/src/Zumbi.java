public class Zumbi {
    double vida;
    String nome;

    double mostraVida(){
        return this.vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        if(this.vida>=quantia){
            this.vida -= quantia;
            zumbiAlvo.vida+= quantia;
        }
        else{
            System.out.println("Nao há vida suficiente pra transferir");
        }
    }

}
