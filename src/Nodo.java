public class Nodo implements iNodoUnidirecional {
  private String info;
  private Nodo prox;

  public Nodo(String info) {
    this.info = info;
    prox = null;
  }

  @Override
  public String getInfo() {
    return info;
  }

  @Override
  public void setInfo(String info) {
    this.info = info;
  }

  // trocar aqui caso não funcione
  @Override
  public Nodo getProx() {
    return prox;
  }

  @Override
  public void setProx(iNodoUnidirecional prox) {
    this.prox = (Nodo) prox;
  }
}
