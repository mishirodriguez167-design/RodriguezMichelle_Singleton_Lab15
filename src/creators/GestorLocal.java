package creators;
import base.GestorNotificaciones;
import base.Notificacion;
import products.ZumbadorMesa;

// ConcreteCreatorA
public class GestorLocal extends GestorNotificaciones {
    @Override
    protected Notificacion crearNotificacion() {
        return new ZumbadorMesa();
    }
}