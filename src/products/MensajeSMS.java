package products;
import base.Notificacion;

// ConcreteProductC
public class MensajeSMS implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("[SMS al 555-1234] -> " + mensaje);
    }
}