public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do inatel";

        Salgado salgado1 = new Salgado();
        salgado1.nome = "Esfiha";

        Salgado salgado2 = new Salgado();
        salgado2.nome = "Espetinho";

        Salgado salgado3 = new Salgado();
        salgado3.nome = "Coxinha";

        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.mostrarInfo();

    }
}
