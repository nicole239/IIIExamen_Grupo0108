/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoA_PortalWEB_Mediator;

import java.util.ArrayList;

/**
 *
 * @author Eduardo Jirón
 */
public class Usuario extends IUsuario
{
    public Usuario(Mediator mediator)
    {
        super();
        super.mediator = mediator;
        mensajes = new ArrayList<>();
        publicaciones = new ArrayList<>();
    }

    @Override
    void publicar(Publicacion publicacion)
    {
        publicaciones.add(publicacion);
    }

    @Override
    void enviarMensajePrivado(String mensaje, IUsuario usuario)
    {
        mediator.enviarMensajePrivado(mensaje, usuario, this);
    }

    @Override
    void recibirMensajePrivado(String mensaje, IUsuario usuario)
    {
        mensajes.add(new Mensaje((Usuario)usuario, mensaje));
    }

    @Override
    void solicitarSubscripcionAPublicaciones(Publicacion publicacion, IUsuario usuario)
    {
        mediator.solicitarSubscripcionAPublicaciones(publicacion, usuario, this);
    }

    @Override
    void recibirSubscripcionAPublicaciones(Publicacion publicacion, IUsuario usuario)
    {
        publicacion.agregarSubscriptor((Usuario)usuario);
    }

    @Override
    void comentarPublicacion(String comentario, Publicacion publicacion, IUsuario usuario)
    {
        mediator.comentarPublicacion(comentario, publicacion, usuario, this);
    }

    @Override
    void recibirComentarPublicacion(String comentario, Publicacion publicacion, IUsuario usuario)
    {
        publicacion.agregarComentario(comentario);
    }
}
