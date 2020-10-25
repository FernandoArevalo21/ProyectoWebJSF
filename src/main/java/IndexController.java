/*
 * Clase encargada de contener la parte logica del codigo
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.AbortProcessingException;

/**
 *
 * @author Fernando Arévalo
 * @author Johan Andres Sanchez
 */
@Named(value = "indexController")
@RequestScoped
public class IndexController {
       /**
     * Se crea la variable name que es un String
     */
private String name;
/**
     * Se crea la variable numero que es un String
     */
private String numero;
  
    public IndexController() {
    }
    /**
     * Se crea el metodo eventoClick
     */
    public void eventoClick(){
        System.out.println("Nombre: "+this.name);
    }
    /**
     * Se crea el metodo Click para el ActionEvent
     */
    public void click(ActionEvent ae){
        System.out.println("Número:"+this.numero);
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private String info;
    
    public String getInfo() {
        return info;
    }

   
    
    
}
