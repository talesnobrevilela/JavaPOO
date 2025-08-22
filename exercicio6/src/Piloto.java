public class Piloto {
    String nome;
    boolean vilao;
    Kart kart;

    void soltaSuperPoder(){
        if(vilao){
            System.out.println(nome + " soltou super poder Reverso");
        }
        else{
            System.out.println(nome + " soltou super poder");
        }

    }
}
