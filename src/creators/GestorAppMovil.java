package creators;
import base.GestorNotificaciones;
import base.Notificacion;
import products.NotificacionPush;

// ConcreteCreatorB
public class GestorAppMovil extends GestorNotificaciones {
    @Override
    protected Notificacion crearNotificacion() {
        return new NotificacionPush();
    }
}
