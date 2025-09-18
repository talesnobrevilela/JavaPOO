package pcmania.pc;

public class SistemaOperacional {

    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    //Getters
    public String GetNome() {
        return nome;
    }
    public int GetTipo() {
        return tipo;
    }
}
