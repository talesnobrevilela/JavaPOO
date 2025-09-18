package pcmania.pc;

public class HardwareBasico {

    private String nome;
    private float capacidade;

    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    //Getters
    public float GetCapacidade() {
        return capacidade;
    }

    public String GetNome() {
        return nome;
    }
}
