package estruturaDeDados;

public class ListaDinamica implements ListaOperacoes {
    No inicio;

    public ListaDinamica() {
        this.inicio = new No(null);
        System.out.println("Lista Dinâmica criada com sucesso!");
    }

    public void adicionarElemento(String conteudo) {
        if(!this.existeInicio()) {
            this.inicio.setConteudo(conteudo);
        } else {
            No novoNo = new No(conteudo);
            No aux = this.inicio;
            while(aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNo);
        }
    }

    private boolean existeInicio() {
        if(this.inicio.getConteudo() == null) {
            return false;
        } else {
            return true;
        }
    }

    public void exibirElementos() {
        if(existeInicio()) {
            No aux = this.inicio;
            while(aux.getProx() != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
            System.out.println(aux.getConteudo());
        } else {
            System.out.println("Não existem elementos na Lista Dinâmica.");
        }
    }

    public void removerElemento(String elemento) {
        if(existeInicio()) {
            if(buscarElemento(elemento)) {
                //removendo primeiro
                if(this.inicio.getConteudo().equals(elemento)) {
                    this.inicio = this.inicio.getProx();
                } else if(this.inicio.getProx() != null) {
                    No aux = this.inicio;
                    do {
                        if(aux.getProx().getConteudo().equals(elemento)) {
                            aux.setProx(aux.getProx().getProx());
                            return;
                        }
                        aux = aux.getProx();
                    } while (aux != null);
                } else {
                    this.inicio.setConteudo(null);
                }
            }

        } else {
            System.out.println("Não existem elementos na lista.");
        }
    }

    public boolean buscarElemento(String elemento) {
        No aux = this.inicio;

        do {
            if(aux.getConteudo().equals(elemento)) {
                System.out.println("Elemento " + elemento + " encontrado.");
                return true;
            }
            aux = aux.getProx();
        } while(aux != null);
        System.out.println("Elemento " + elemento + " não encontrado!");
        return false;
    }

    //Interfaceeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
    @Override
    public int removerOcorrencias(String elemento) {
        int contador = 0;
        if(existeInicio()){
            if(buscarElemento(elemento)){
                No aux = this.inicio;
                while(aux != null) {
                    if(aux.getConteudo().equals(elemento)){

                        removerElemento(aux.getConteudo());
                        contador ++;
                    }
                    aux = aux.getProx();
                }
            }
        }
        return contador;
    }

    @Override
    public int retornarQuantidadeElementos() {
        int contador = 0;
        No aux = this.inicio;
        while(aux != null){

            contador ++;
            aux = aux.getProx();
        }
        return contador;
    }

    @Override
    public void adicinarMultiplosElementos(String[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            adicionarElemento(vetor[i]);
        }
    }

    @Override
    public String elementoEmIndice(int indice) {
        int contador = 0;

        if (tamanhoLista()-1 >= indice) {
            No aux = this.inicio;
            while(aux != null) {
                if(contador == indice) {
                    break;
                }
                aux = aux.getProx();
                contador++;
            }
            return aux.getConteudo();
        } else {
            System.out.println("número de índice inválido");
            return null;
        }

    }

    private int tamanhoLista() {
        int tamanho = 0;
        No aux = this.inicio;
        while(aux != null) {
            aux = aux.getProx();
            tamanho++;
        }
        return tamanho;
    }

    public void inserirElementoPosicao(int posicao) {

    }


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

