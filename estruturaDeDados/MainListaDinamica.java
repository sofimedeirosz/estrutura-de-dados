package estruturaDeDados;

public class MainListaDinamica {
    public static void main(String[] args) {
        ListaDinamica listaDinamica = new ListaDinamica();
        listaDinamica.adicionarElemento("Arroz");
        listaDinamica.adicionarElemento("Feijão");
        listaDinamica.adicionarElemento("Feijão");
        //listaDinamica.removerOcorrencias("Feijão");
        listaDinamica.exibirElementos();
        System.out.println(listaDinamica.retornarQuantidadeElementos());
        String[] vetor = {"Leite", "Carne", "Cenoura"};
        listaDinamica.adicinarMultiplosElementos(vetor);
        listaDinamica.exibirElementos();
        System.out.println("-=--=-=--=-=-");
        System.out.println(listaDinamica.elementoEmIndice(15));
    }
}