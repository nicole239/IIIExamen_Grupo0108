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
public class Mensaje
{
    private Usuario emisor;
    private String mensaje;
    
    public Mensaje(Usuario emisor, String mensaje)
    {
        this.emisor = emisor;
        this.mensaje = mensaje;
    }
}
