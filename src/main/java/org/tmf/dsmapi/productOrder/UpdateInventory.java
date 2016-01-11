package org.tmf.dsmapi.productOrder;

import java.util.ArrayList;
import org.tmf.dsmapi.productOrder.event.*;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.xml.bind.*;
import org.codehaus.jackson.map.ObjectMapper;
import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.eclipse.persistence.oxm.MediaType;





import org.tmf.dsmapi.commons.exceptions.BadUsageException;
import org.tmf.dsmapi.commons.jaxrs.RESTClient;
import org.tmf.dsmapi.hub.Hub;
import org.tmf.dsmapi.hub.HubFacade;
import org.tmf.dsmapi.productOrder.model.Product;
import org.tmf.dsmapi.productOrder.model.ProductOrder;
import org.tmf.dsmapi.productOrder.model.Reference;

/**
 *
 * @author pierregauthier should be async or called with MDB
 */
@Stateless
@Asynchronous

public class UpdateInventory implements UpdateInventoryLocal {

    @EJB
    HubFacade hubFacade;
    @EJB
    EventFacade eventFacade;
    @EJB
    RESTEventPublisherLocal restEventPublisherLocal;
    
    @EJB
    PropertySingleton propertyAcces;
    
    @EJB
    RESTClient client;


    /** 
     * Add business logic below. (Right-click in editor and choose
     * "Insert Code > Add Business Method")
     * Access Hubs using callbacks and send to http publisher 
     *(pool should be configured around the RESTEventPublisher bean)
     * Loop into array of Hubs
     * Call RestEventPublisher - Need to implement resend policy plus eviction
     * Filtering is done in RestEventPublisher based on query expression
    */ 
    @Override
    public void publish(Event event) {
        try {
            eventFacade.create(event);
        } catch (BadUsageException ex) {
            Logger.getLogger(UpdateInventory.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<Hub> hubList = hubFacade.findAll();
        Iterator<Hub> it = hubList.iterator();
        while (it.hasNext()) {
            Hub hub = it.next();
            restEventPublisherLocal.publish(hub, event);
        }
    }

    @Override
    
    public void createNotification(ProductOrder bean, Date date) {
      
        Event event = new Event();
        event.setEventTime(date);
       event.setResource(bean);
        event.setEventType(EventTypeEnum.orderCreationNotification);
        publish(event);

    }

    @Override
    public void removeNotification(ProductOrder bean, Date date) {
        Event event = new Event();
        event.setEventTime(date);
        event.setResource(bean);
        event.setEventType(EventTypeEnum.orderRemoveNotification);
        publish(event);
    }
	
    @Override
    public void orderInformationRequiredNotification(ProductOrder bean, Date date) {
        Event event = new Event();
        event.setEventTime(date);
        event.setResource(bean);
        event.setEventType(EventTypeEnum.orderInformationRequiredNotification);
        publish(event);
    }

    @Override
    public void valueChangeNotification(ProductOrder bean, Date date) {
        Event event = new Event();
        event.setEventTime(date);
       event.setResource(bean);
        event.setEventType(EventTypeEnum.orderValueChangeNotification);
        publish(event);
    }

    @Override
    public void stateChangeNotification(ProductOrder bean, Date date) {
        Event event = new Event();
        event.setEventTime(date);
        event.setResource(bean);
        event.setEventType(EventTypeEnum.orderStateChangeNotification);
        publish(event);
    }
    
      public void addToInventory() {
        
       
        System.out.println("inventory URL =" + propertyAcces.getURL());
        
    }

    @Override
    public void addToInventory(Product currentProduct) {
         String URL = propertyAcces.getURL() + "/" + "product";
         
         //URL = "http://requestb.in/12d7ujk1";
         //System.out.println("inventory URL =" + propertyAcces.getURL());
         //System.out.println("Product  =" + currentProduct.toString());
         System.out.println("Product Offering ID =" + currentProduct.getProductOffering().getId());
         System.out.println("Product Offering HREF =" + currentProduct.getProductOffering().getHref());
         
         //POST product in Inventory http://localhost:8080/DSProductInventory/api/productInventory/v2
        //List<Reference> pofList = new ArrayList<Reference>();
         
         
         //currentProduct.getProductOffering().setBundledProductOffering(pofList);
         //currentProduct.getProductOffering().setHref("oco");
        //  currentProduct.getProductOffering().setBundledProductOffering(null);
          
        //   Gson objGson = new Gson();
        //System.out.println(objGson.toJson(objSampleDTO));
          
       /*   JAXBContext jc = null;
        try {
            jc = JAXBContext.newInstance(Product.class);
        } catch (JAXBException ex) {
            Logger.getLogger(UpdateInventory.class.getName()).log(Level.SEVERE, null, ex);
        }

       
        
                
        Marshaller marshaller = null;
        try {
            marshaller = jc.createMarshaller();
        } catch (JAXBException ex) {
            Logger.getLogger(UpdateInventory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
          
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        } catch (PropertyException ex) {
            Logger.getLogger(UpdateInventory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            
           
            marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, MediaType.APPLICATION_JSON);
        } catch (PropertyException ex) {
            Logger.getLogger(UpdateInventory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            marshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, false);
        } catch (PropertyException ex) {
            Logger.getLogger(UpdateInventory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            marshaller.marshal(currentProduct, System.out);
        } catch (JAXBException ex) {
            Logger.getLogger(UpdateInventory.class.getName()).log(Level.SEVERE, null, ex);
        }
               
               */
        
          
         client.publishEvent(URL, currentProduct);
    }
      
      

}
