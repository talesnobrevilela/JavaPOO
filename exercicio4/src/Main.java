public class Main{

    public static void main(String[] args){
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 100;

        System.out.println("A vida do zumbi z1: " + z1.vida);
        System.out.println("A vida do zumbi z2: " + z2.vida);

        if(z1.transfereVida(z2, 20)){
            System.out.println("Fazendo o zumbi z1 enviar 20 de vida pro z2");
            System.out.println("A vida do zumbi z1 é " + z1.vida);
            System.out.println("A vida do zumbi z2 é " + z2.vida);
        }
        if(z1.transfereVida(z2, 80)){
            System.out.println("Fazendo o zumbi z1 enviar 80 de vida pro z2");
            System.out.println("A vida do zumbi z1 é " + z1.vida);
            System.out.println("A vida do zumbi z2 é " + z2.vida);
        }
        else{
            System.out.println("Vida nao alterada");
        }




    }
}