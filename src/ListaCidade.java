public class ListaCidade extends Lista {
  public ListaCidade() {
    super();
  }

  @Override
  public NodoCidade busca(String cidade) {
    return (NodoCidade) super.busca(cidade);
  }
}
