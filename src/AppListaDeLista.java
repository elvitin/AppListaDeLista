public class AppListaDeLista {
  public static void main(String... argumentos) {

    ListaEstado listaEstado = new ListaEstado();

    listaEstado.inserirEstadoCidade("Santa Catarina", "Joinville");
    listaEstado.inserirEstadoCidade("Santa Catarina", "Blumenau");

    listaEstado.inserirEstadoCidade("Paraná", "Maringá");
    listaEstado.inserirEstadoCidade("Paraná", "Apucarana");
    listaEstado.inserirEstadoCidade("Paraná", "Londrina");
    listaEstado.inserirEstadoCidade("Paraná", "Arapongas");

    listaEstado.inserirEstadoCidade("São Paulo", "Marília");
    listaEstado.inserirEstadoCidade("São Paulo", "Presidente Prudente");
    listaEstado.inserirEstadoCidade("São Paulo", "Assis");

    listaEstado.listaEstadoCidades("são paulo");
    listaEstado.listaEstadoCidades("paraná");
    listaEstado.listaEstadoCidades("Santa Catarina");

    listaEstado.listaEstadoCidades("Mato Grosso");
    System.out.println(listaEstado.existeEstadoCidade("São Paulo", "Nantes"));
    System.out.println(listaEstado.existeEstadoCidade("São Paulo", "Assis"));

    System.out.println(listaEstado.busca("São Paulo"));
    System.out.println(listaEstado.tamanho());
    System.out.println("---------------------------------------");
    listaEstado.listaTudo();
    System.out.println("---------------------------------------");
    listaEstado.ordenaTudo();
    listaEstado.listaTudo();

    listaEstado.ordena();
    ListaCidade listaCidades = listaEstado.busca("São Paulo").getListaCidade();
    listaCidades.ordena();
  }
}