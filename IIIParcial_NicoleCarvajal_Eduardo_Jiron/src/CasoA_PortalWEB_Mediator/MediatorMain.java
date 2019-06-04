/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoA_PortalWEB_Mediator;

import java.io.IOException;

/**
 *
 * @author Eduardo Jirón
 */
public class MediatorMain
{
    public static void main(String[] args)
    {
        PortalWeb portal = new PortalWeb();
        Usuario eduardo = new Usuario(portal);
        portal.registrar(eduardo);
        Usuario nicole = new Usuario(portal);
        portal.registrar(nicole);
        eduardo.enviarMensajePrivado("Hola", nicole);
        nicole.enviarMensajePrivado("Todo bien", eduardo);
        Publicacion p = new Publicacion("Saludos");
        eduardo.publicar(p);
        nicole.solicitarSubscripcionAPublicaciones(p, eduardo);
        nicole.comentarPublicacion("Saludos", p, eduardo);
        Usuario debug = new Usuario(portal);
    }
}
