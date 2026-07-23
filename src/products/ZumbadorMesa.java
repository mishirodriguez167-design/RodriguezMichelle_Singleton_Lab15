package products;
import base.Notificacion;

// ConcreteProductA
public class ZumbadorMesa implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("(( ZUMBADOR VIBRANDO )) -> " + mensaje);
    }
}