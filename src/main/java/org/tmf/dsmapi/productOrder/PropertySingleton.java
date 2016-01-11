/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tmf.dsmapi.productOrder;

import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

@Singleton
public class PropertySingleton {
    
static String url = null;
    
public String  getURL() { 
    if( url == null  ) {
    System.out.println("Reading Property from Bundle");
    return url = ResourceBundle.getBundle("settings").getString("inventoryURL");
    }
    else return url;


}

}
