package base;

// Esta es la clase abstracta 'Creator' del diagrama
public abstract class GestorNotificaciones {

    // Método principal que usa la caja registradora
    public void notificarCliente(String mensaje) {
        // Llama al Factory Method para crear el objeto correcto dinámicamente
        Notificacion notificacion = crearNotificacion();
        notificacion.enviar(mensaje);
    }

    // Factory Method: Las subclases deciden qué instanciar aquí
    protected abstract Notificacion crearNotificacion();
}