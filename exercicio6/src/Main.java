public class Main {
    public static void main(String[] args) {

        Motor m1 = new Motor();
        m1.cilindradas = "50";
        m1.velocidadeMaxima = 100;

        Motor m2 = new Motor();
        m2.cilindradas = "150";
        m2.velocidadeMaxima = 150;

        Kart k1 = new Kart();
        k1.nome = "Uno";
        k1.motor = m2;

        Kart k2 = new Kart();
        k2.nome = "Kwid";
        k2.motor = m1;

        Piloto p1 = new Piloto();
        p1.nome = "Mario";
        p1.vilao = false;
        p1.kart = k1;

        Piloto p2 = new Piloto();
        p2.nome = "Mario Reverso";
        p2.vilao = true;
        p2.kart = k2;



        p1.kart.motor.mostraInfo();
        p1.kart.pular();
        p1.soltaSuperPoder();
        p1.kart.soltarTurbo();

        p2.kart.motor.mostraInfo();
        p2.kart.fazerDrift();
        p2.soltaSuperPoder();




    }
}
