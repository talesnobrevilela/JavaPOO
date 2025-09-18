package pcmania.pc;

public class MemoriaUSB {

    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade){
        this.nome = nome;
        this.capacidade = capacidade;
    }

    //Getters
    public String GetNome(){
        return nome;
    }
    public int GetCapacidade(){
        return capacidade;
    }

}
