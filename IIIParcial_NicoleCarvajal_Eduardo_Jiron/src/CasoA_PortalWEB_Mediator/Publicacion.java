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
public class Publicacion
{
    private Object contenido;
    private List<String> comentarios;
    private List<Usuario> subscriptores;
    
    public Publicacion(Object contenido)
    {
        this.contenido = contenido;
        this.comentarios = new ArrayList<>();
        this.subscriptores = new ArrayList<>();
    }
    
    public void agregarComentario(String comentario)
    {
        comentarios.add(comentario);
    }
    
    public void agregarSubscriptor(Usuario subscriptor)
    {
        subscriptores.add(subscriptor);
    }
}
