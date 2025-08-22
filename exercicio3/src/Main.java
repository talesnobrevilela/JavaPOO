public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z1.nome = "Zumbi 1";

        z2.vida = 200;
        z2.nome = "Zumbi 2";

        System.out.println(z1.nome + " tem vida: " + z1.mostraVida());
        System.out.println(z2.nome + " tem vida: " + z2.mostraVida());

        z1 = z2;

        z1.vida = 200;

        System.out.println(" Após atribuicao de z1 = z2:");
        System.out.println("vida do zumbi z1: " + z1.mostraVida());
        System.out.println("vida do zumbi z2: " + z2.mostraVida());

    }
}
