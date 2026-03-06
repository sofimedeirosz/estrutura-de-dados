package estruturaDeDados;

public class Main {
    public static void main(String[] args) {
        ListaSimples listaSimples = new ListaSimples(5);
        listaSimples.exibirElementos();
        listaSimples.adicionarElemento("Arroz");
        listaSimples.adicionarElemento("Feijão");
        listaSimples.adicionarElemento("Batata");
        //listaSimples.adicionarElemento("Arroz2");
        listaSimples.adicionarElemento("Feijão");
        //listaSimples.removerElemento("Batata");
        listaSimples.quantidadeElementos();
        listaSimples.exibirElementos();
        System.out.println("Quantidade de ocorrências removidas: "+listaSimples.removerOcorrencias("Feijão"));
        listaSimples.exibirElementos();
        System.out.println(listaSimples.retornarQuantidadeElementos());
        String[] vetor = {"Leite", "Carne", "Cenorua"};
        listaSimples.adicinarMultiplosElementos(vetor);
        listaSimples.exibirElementos();
        System.out.println(listaSimples.elementoEmIndice(3));
    }
}