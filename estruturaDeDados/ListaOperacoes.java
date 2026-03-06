package estruturaDeDados;

public interface ListaOperacoes {
    //Remover todas ocorrencias e retornar quantos removeu

    public int removerOcorrencias(String elemento);

    //Retornar qtd total de elementos válidos (exceto null)

    public int retornarQuantidadeElementos();

    //Adicionar múltiplo elementos

    public void adicinarMultiplosElementos(String[] vetor);

    //Retorne o elemento armazenado em uma determinada posição da lista

    public String elementoEmIndice(int indice);

    //Insire um elemento em uma posição específica da lista
    public void inserirElementoPosicao(int posicao);

    //Remove um elemento em uma posição específica da lista
    public void removerElementoPosicao(int posicao);

    //Remove todos os elementos da lista, deixando-a vazia
    public void esvaziarLista();

    //Retorna o índice da última ocorrência de um elemento na lista
    public int retornarUltimoIndice(String elemento);

    //Conta quantas vezes um determinado elemento aparece na lista
    public void contarElementos(String elemento);

    //Substitui todas as ocorrências de um elemento antigo por um novo elemento
    public void substituirElemento(String elemento, String novoElemento);



}
