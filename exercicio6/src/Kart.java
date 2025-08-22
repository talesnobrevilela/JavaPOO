public class Kart {
    String nome;
    Motor motor;

    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println(nome + " pulou!!!");
    }
    void soltarTurbo(){
        System.out.println( nome + " soltou turbo!!!");
    }
    void fazerDrift(){
        System.out.println( nome + " fez drift!!!");
    }

}
