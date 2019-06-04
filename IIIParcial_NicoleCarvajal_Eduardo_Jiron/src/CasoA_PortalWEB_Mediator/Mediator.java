/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasoA_PortalWEB_Mediator;

/**
 *
 * @author Eduardo Jirón
 */
public interface Mediator
{
    void registrar(IUsuario usuario);
    void publicar(Publicacion publicacion, IUsuario usuario);
    void enviarMensajePrivado(String mensaje, IUsuario receptor, IUsuario emisor);
    void solicitarSubscripcionAPublicaciones(Publicacion publicacion, IUsuario usuario, IUsuario solicitante);
    void comentarPublicacion(String comentario, Publicacion publicacion, IUsuario usuario, IUsuario comentador);
}
