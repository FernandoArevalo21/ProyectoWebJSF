/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

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
        //= "Universidad De Cundinamarca";
  
 
    public IndexController() {
        System.out.println(world);
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }
    public void actionListener() {
        // Poll stock ticker service and get the data for the requested symbol.
        this.info= "" + System.currentTimeMillis();
    }
    
    private String info;
    
    public String getInfo() {
        return info;
    }

   
    
    
}
