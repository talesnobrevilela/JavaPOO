public class Cantina {
    String nome;
    Salgado[] salgados = new Salgado[3];


    void addSalgado(Salgado salgadoAdd){
        for(int i=0; i< salgados.length; i++){   //varre o array
            if(salgados[i] == null){      //verifica se não existe salgado
                salgados[i] = salgadoAdd;// adiciona salgado
                break;             // após add, sai do loop
            }
        }
    }
    void mostrarInfo(){
        System.out.println("A Cantina do Inatel possui os seguintes salgados: ");
        for(Salgado salgadoAtual : salgados){ // retorna cada posicao do array
            if(salgadoAtual != null){
                System.out.println(salgadoAtual.nome);
            }
        }
    }
}
