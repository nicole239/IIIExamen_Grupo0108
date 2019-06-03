/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoA_PortalWEB_Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo Jirón
 */
public class PortalWeb implements Mediator
{
    private List<Usuario> usuariosRegistrados;

    @Override
    public void registrar(IUsuario usuario)
    {
        if(usuariosRegistrados == null)
            usuariosRegistrados = new ArrayList<>();
        usuariosRegistrados.add((Usuario)usuario);
    }

    @Override
    public void publicar(Publicacion publicacion, IUsuario usuario)
    {
        ((Usuario)usuario).publicar(publicacion);
    }

    @Override
    public void enviarMensajePrivado(String mensaje, IUsuario receptor, IUsuario emisor)
    {
        receptor.recibirMensajePrivado(mensaje, emisor);
    }

    @Override
    public void solicitarSubscripcionAPublicaciones(Publicacion publicacion, IUsuario usuario, IUsuario solicitante)
    {
        usuario.recibirSubscripcionAPublicaciones(publicacion, solicitante);
    }

    @Override
    public void comentarPublicacion(String comentario, Publicacion publicacion, IUsuario usuario, IUsuario comentador)
    {
        usuario.recibirComentarPublicacion(comentario, publicacion, comentador);
    }
}
