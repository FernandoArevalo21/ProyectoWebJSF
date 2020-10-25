/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.AbortProcessingException;

/**
 *
 * @author usuario
 */
@Named(value = "indexController")
@RequestScoped
public class IndexController {
       /**
     * Creates a new instance of IndexController
     */
private String world ;
private String name;
private String message;
        //= "Universidad De Cundinamarca";
  
 
    public IndexController() {
        
    }
    public void eventoClick(){
        System.out.println("Nombre: "+this.name);
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void actionListener(ActionEvent ae) {
        // El metodo lo que hace es revisar las acciones y obtiene los datos solicitados
        this.info= "" + System.currentTimeMillis();
    }
    
    private String info;
    
    public String getInfo() {
        return info;
    }

   
    
    
}
