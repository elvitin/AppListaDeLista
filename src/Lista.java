public abstract class Lista implements iLista {
  private Nodo inicio;
  private int tamanho;

  public Lista() {
    inicio = null;
    tamanho = 0;
  }

  public void insereFim(iNodoUnidirecional nodo) {
    if (eVazio()) {
      inicio = (Nodo) nodo;
    } else {
      obterUltimo().setProx(nodo);
    }
    tamanho++;
  }

  public void ordena() {
    Nodo aux = inicio;
    Nodo aux2 = inicio;

    while (aux != null) {
      while (aux2 != null) {
        if (aux.getInfo().compareTo(aux2.getInfo()) > 0) {
          String temp = aux.getInfo();
          aux.setInfo(aux2.getInfo());
          aux2.setInfo(temp);
        }
        aux2 = aux2.getProx();
      }
      aux = aux.getProx();
      aux2 = aux;
    }
  }

  public void imprime() {
    Nodo aux = inicio;
    while (aux != null) {
      System.out.printf("[%s]\n", aux.getInfo());
      aux = aux.getProx();
    }
    System.out.println();
  }

  public boolean eVazio() {
    return inicio == null;
  }

  public Nodo getInicio() {
    return inicio;
  }

  public void setInicio(iNodoUnidirecional inicio) {
    this.inicio = (Nodo) inicio;
  }

  private Nodo obterUltimo() {
    Nodo aux = inicio;

    while (aux.getProx() != null) {
      aux = aux.getProx();
    }
    return aux;
  }

  public int tamanho() {
    return tamanho;
  }

  public Nodo busca(String info) {
    Nodo aux = inicio;

    while (aux != null && !aux.getInfo().equalsIgnoreCase(info)) {
      aux = aux.getProx();
    }
    return aux;
  }
}
