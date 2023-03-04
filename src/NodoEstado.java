public class NodoEstado extends Nodo {
  private final ListaCidade listaCidade;
  public NodoEstado(String estado, String cidade) {
    super(estado);
    listaCidade = new ListaCidade();
    listaCidade.insereFim(new NodoCidade(cidade));
  }
  public ListaCidade getListaCidade() {
    return listaCidade;
  }
}
