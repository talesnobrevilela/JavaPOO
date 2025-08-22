public class Main {
    public static void main(String[] args) {

        Personagem heroi = new Personagem();
        Arma m1 = new Arma();
        Arma m2 = new Arma();

        heroi.nome = "Poseidon";
        heroi.pontos = 100;

        m1.nome = "Souleater";
        m1.poder = 85;
        m1.resistencia = 100;
        m1.descricao = "Arma de duas mãos.";

        m2.nome = "Sanguine Battleaxe";
        m2.poder = 80;
        m2.resistencia = 90;
        m2.descricao = "Arma de duas mãos.";

        heroi.arma = m1;

        heroi.usarArma();
        heroi.arma.mostrarInfoArma();

        heroi.tomarDano();
        heroi.tomarDano();

        heroi.arma = m2;

        heroi.usarArma();
        heroi.arma.mostrarInfoArma();

        heroi.tomarDano();
        heroi.tomarDano();
        

    }
}
