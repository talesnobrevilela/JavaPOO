package pcmania.pc;

public class Computador {

    private String marca;
    private float preco;
    private SistemaOperacional sistema;
    private HardwareBasico[] hardwares;
    private MemoriaUSB memoria;

    public Computador(String marca, float preco,SistemaOperacional sistema, HardwareBasico[] hardwares ){
        this.marca = marca;
        this.preco = preco;
        this.sistema = sistema;
        this.hardwares = hardwares;
    }

     public void mostraPCConfigs(){
         System.out.println("Marca: " + this.marca);
         System.out.println("Preço: R$" + this.preco);
         System.out.println("Hardware Básico:");
         System.out.println("  - " + hardwares[0].GetNome() + " (" + hardwares[0].GetCapacidade() + " Mhz)");
         System.out.println("  - " + hardwares[1].GetCapacidade() + " Gb de Memória RAM");
         System.out.println("  - " + hardwares[2].GetCapacidade() + " Gb de HD");
         System.out.println("Sistema Operacional: " + this.sistema.GetNome() + " (" + this.sistema.GetTipo() + " bits)");
         System.out.println("Acompanha: " + this.memoria.GetNome() + " de " + this.memoria.GetCapacidade() + " Gb");
         System.out.println("-------------------------");


     }
     public void addMemoriaUSB(MemoriaUSB memoria){
         this.memoria = memoria;
     }
    //Get
    public float GetPreco() {
        return preco;
    }
}
