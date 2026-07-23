package client;

import base.GestorNotificaciones;
import creators.GestorAppMovil;
import creators.GestorDeliveryTelefonico;
import creators.GestorLocal;

public class SistemaCafeteria {
    public static void main(String[] args) {
        String mensajeCafe = "Su Caramel Macchiato está listo en la barra.";

        System.out.println("PROCESANDO ORDEN #01 [Mostrador]");
        GestorNotificaciones gestor1 = new GestorLocal();
        gestor1.notificarCliente(mensajeCafe);

        System.out.println("\nPROCESANDO ORDEN #02 [App Móvil]");
        GestorNotificaciones gestor2 = new GestorAppMovil();
        gestor2.notificarCliente(mensajeCafe);

        System.out.println("\nPROCESANDO ORDEN #03 [Canal Telefónico]");
        GestorNotificaciones gestor3 = new GestorDeliveryTelefonico();
        gestor3.notificarCliente(mensajeCafe);
    }
}