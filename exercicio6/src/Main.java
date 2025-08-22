public class Main {
    public static void main(String[] args) {

        Kart k1 = new Kart();
        k1.nome = "Kart Vermelho";
        k1.motor.cilindradas = "150";
        k1.motor.velocidadeMaxima = 95;

        Kart k2 = new Kart();
        k2.nome = "Kart Azul";
        k2.motor.cilindradas = "100";
        k2.motor.velocidadeMaxima = 70;

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
