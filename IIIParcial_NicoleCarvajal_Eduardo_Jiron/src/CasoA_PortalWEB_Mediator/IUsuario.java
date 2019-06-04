/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoA_PortalWEB_Mediator;

import java.util.List;

/**
 *
 * @author Eduardo Jirón
 */
public abstract class IUsuario
{
    protected Mediator mediator;
    protected List<Publicacion> publicaciones;
    protected List<Mensaje> mensajes;

    abstract void publicar(Publicacion publicacion);
    abstract void enviarMensajePrivado(String mensaje, IUsuario usuario);
    abstract void recibirMensajePrivado(String mensaje, IUsuario usuario);
    abstract void solicitarSubscripcionAPublicaciones(Publicacion publicacion, IUsuario usuario);
    abstract void recibirSubscripcionAPublicaciones(Publicacion publicacion, IUsuario usuario);
    abstract void comentarPublicacion(String comentario, Publicacion publicacion, IUsuario usuario);
    abstract void recibirComentarPublicacion(String comentario, Publicacion publicacion, IUsuario usuario);
}
