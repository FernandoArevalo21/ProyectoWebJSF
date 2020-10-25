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
private String name;
private String numero;
        //= "Universidad De Cundinamarca";
  
    public IndexController() {
    }
    public String outcome(){
        
        return "result";
    }
    public void eventoClick(){
        System.out.println("Nombre: "+this.name);
    }
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
