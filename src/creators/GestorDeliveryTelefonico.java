package creators;
import base.GestorNotificaciones;
import base.Notificacion;
import products.MensajeSMS;

// ConcreteCreatorC
public class GestorDeliveryTelefonico extends GestorNotificaciones {
    @Override
    protected Notificacion crearNotificacion() {
        return new MensajeSMS();
    }
}