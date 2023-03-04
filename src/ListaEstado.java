public class ListaEstado extends Lista {

  ListaEstado() {
    super();
  }

  // a. Inserir os pares Estado,Cidade ao final das listas (tipo Fila)!;
  public void inserirEstadoCidade(String estado, String cidade) {

    if (eVazio()) {
      setInicio(new NodoEstado(estado, cidade));
    } else {
      NodoEstado auxEstado = busca(estado);
      if (auxEstado != null) {
        ListaCidade auxCidade = auxEstado.getListaCidade();
        if (auxCidade.busca(cidade) == null) {
          auxCidade.insereFim(new NodoCidade(cidade));
        } else {
          System.out.printf("Cidade %s já existe no estado %s\n", cidade, estado);
        }
      } else {
        insereFim(new NodoEstado(estado, cidade));
      }
    }

  }

  // b. Ordenar as Listas de Estado e as listas de Cidades
  // ordena só a lista de estados

  // ordena a lista de estados e a lista de cidades
  public void ordenaTudo() {
    ordena();
    NodoEstado auxEstado = (NodoEstado) getInicio();
    while (auxEstado != null) {
      auxEstado.getListaCidade().ordena();
      auxEstado = (NodoEstado) auxEstado.getProx();
    }
  }

  // c. Buscar um Estado retornando o endereço do nodo, ou null caso não encontre;
  @Override
  public NodoEstado busca(String estado) {
    return (NodoEstado) super.busca(estado);
  }

  // d. Listar todas as Cidades de um determinado Estado;
  public void listaEstadoCidades(String estado) {
    NodoEstado auxEstado = busca(estado);
    if (auxEstado != null) {
      auxEstado.getListaCidade().imprime();
    } else {
      System.out.printf("Estado [%s] não encontrado\n", estado);
    }
  }

  public void listaTudo() {
    NodoEstado auxEstado = (NodoEstado) getInicio();
    while (auxEstado != null) {
      System.out.printf("[%s]\n", auxEstado.getInfo());
      NodoCidade auxCidade = (NodoCidade) auxEstado.getListaCidade().getInicio();
      while (auxCidade != null) {
        System.out.printf("\t\t[%s]\n", auxCidade.getInfo());
        auxCidade = (NodoCidade) auxCidade.getProx();
      }
      auxEstado = (NodoEstado) auxEstado.getProx();
    }
  }

  // e. Verificar se um par Estado,Cidade está inserido nas Listas, retornando um boolean (True/False).
  public boolean existeEstadoCidade(String estado, String cidade) {
    NodoEstado auxEstado = busca(estado);
    return auxEstado != null && auxEstado.getListaCidade().busca(cidade) != null;
  }
}
