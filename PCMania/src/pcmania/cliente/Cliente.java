package pcmania.cliente;

import pcmania.pc.Computador;

public class Cliente {

    private String nome;
    private String cpf;
    public Computador[] computadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[20]; //2..
    }


    public float calculaTotalCompra(){
        float total = 0;
        for (Computador computador : computadores) { // for each
            if (computador != null) {
                total += computador.GetPreco();
            }
        }
        return total;
    }

    //Getters e Setters
    public String GetNome() {
        return nome;
    }

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public String GetCpf() {
        return cpf;
    }

    public void SetCpf(String cpf) {
        this.cpf = cpf;
    }
}
