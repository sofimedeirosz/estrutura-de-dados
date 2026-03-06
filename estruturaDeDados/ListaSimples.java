package estruturaDeDados;

public class ListaSimples implements ListaOperacoes{
    String[] lista;

    public ListaSimples(int tamanho) {
        this.lista = new String[tamanho];
    }

    public void exibirElementos() {
        for (int i = 0; i < this.lista.length; i++) {
            System.out.println("Lista[" + i + "] = " + this.lista[i]);
        }
    }

    public void adicionarElemento(String elemento) {
        if (!estaCheia()) {
            this.lista[encontrarPosicaoVazia()] = elemento;
            System.out.println("Elemento " + elemento + " adicionado com sucesso!");
        }
    }


    private boolean estaCheia() {
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == null) {
                return false;
            }
        }
        System.out.println("A lista está cheia!");
        return true;
    }

    private boolean estaVazio() {
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] != null) {
                return false;
            }
        }
        System.out.println("A lista está vazia!");
        return true;
    }

    private int encontrarPosicaoVazia() {
        int i;
        for (i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == null) {
                return i;
            }
        }
        return i;
    }

    public void removerElemento(String elemento) {
        if (!estaVazio()) {
            if (this.buscarElemento(elemento) >= 0) {
                this.lista[this.buscarElemento(elemento)] = null;
                System.out.println("Elemento " + elemento + " removido com sucesso!");
            }
        }
    }

    public int buscarElemento(String elemento){
        int i;
        if (!estaVazio()) {
            for (i = 0; i < this.lista.length; i++) {
                if (this.lista[i].equals(elemento)) {
                    return i;
                }
            }
        }
        System.out.println("Elemento não encontrado na lista.");
        return -1;
    }

    public void alterarElemento(String elementoASerAlterado, String alteracao) {
        if(buscarElemento(elementoASerAlterado) >= 0) {
            this.lista[buscarElemento(elementoASerAlterado)] = alteracao;
            System.out.println("Elemento " + elementoASerAlterado + " alterado com sucesso para " + alteracao);
        }
    }

    public void quantidadeElementos() {
        int cont = 0;
        if(!estaVazio()) {
            for (int i = 0; i < this.lista.length; i++) {
                if(this.lista[i] != null) {
                    cont++;
                }
            }
        }
        System.out.println("A lista possui " + cont + " elementos!");
    }

    //Interfaceeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
    @Override
    public int removerOcorrencias(String elemento) {
        int i;
        int contador = 0;
        if (!estaVazio()) {
            for (i = 0; i < this.lista.length; i++) {
                if(this.lista[i] != null) {
                    if (this.lista[i].equals(elemento)) {
                        this.lista[i] = null;
                        contador ++;
                    }
                }
            }
            return contador;
        }
        System.out.println("Elemento não encontrado.");
        return 0;
    }

    @Override
    public int retornarQuantidadeElementos() {
        int contador = 0;
        for(int i =0; i < lista.length; i++){
            if(lista[i] != null){
                contador ++;
            }
        }
        return contador;
    }

    @Override
    public void adicinarMultiplosElementos(String[] vetor) {
        for(int j = 0; j < vetor.length; j++){
            for (int i = 0; i < this.lista.length; i++) {
                if(this.lista[i] == null){
                    this.lista[i] = vetor[j];
                    break;
                }
            }
        }
    }

    @Override
    public String elementoEmIndice(int indice) {
        return lista[indice];
    }

    @Override
    public void inserirElementoPosicao(int posicao) {

    }

    @Override
    public void removerElementoPosicao(int posicao) {

    }

    @Override
    public void esvaziarLista() {

    }

    @Override
    public int retornarUltimoIndice(String elemento) {
        return 0;
    }

    @Override
    public void contarElementos(String elemento) {

    }

    @Override
    public void substituirElemento(String elemento, String novoElemento) {

    }
}