package products;
import base.Notificacion;

// ConcreteProductB
public class NotificacionPush implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("[App Móvil - PUSH] -> " + mensaje);
    }
}
