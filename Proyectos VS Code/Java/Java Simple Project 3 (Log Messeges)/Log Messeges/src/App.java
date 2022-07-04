import java.util.logging.Logger;
import java.util.logging.Level;

public class App {
    private final static Logger LOGGER = Logger.getLogger(App.class.getName()); //El log obtiene el nombre de la clase y el método en el que esta el mensaje
    public static void main(String[] args){
        LOGGER.setLevel(Level.CONFIG);
        LOGGER.info("Hola Mundo ahora se escribe así WTF");
        LOGGER.warning("conchesumadre");
        LOGGER.config("Prueba de que esto no se registra");
    }
}
