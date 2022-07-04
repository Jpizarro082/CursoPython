public class App{

  //Función Principal
  public static void main(String[] args) {
    DatosPrecargados precargados = new DatosPrecargados();
    Inicio ventana = new Inicio(1080,720);
    ventana.iniciarComponentes(precargados.datosPrecargados());
    ventana.setVisible(true);
  }
}
