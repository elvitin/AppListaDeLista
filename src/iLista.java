public interface iLista {
  void insereFim(iNodoUnidirecional nodo);

  void ordena();

  void imprime();

  boolean eVazio();

  iNodoUnidirecional getInicio();

  void setInicio(iNodoUnidirecional inicio);

  iNodoUnidirecional busca(String info);
}
