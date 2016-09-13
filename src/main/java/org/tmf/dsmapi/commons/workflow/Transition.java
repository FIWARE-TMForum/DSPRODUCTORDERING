package org.tmf.dsmapi.commons.workflow;

import java.io.Serializable;
import java.util.EnumSet;
import static java.util.EnumSet.noneOf;

/**
 *
 * @author maig7313
 * @param <E>
 */
public class Transition<E extends Enum<E>> implements Serializable, Cloneable{

    private E from;
    private EnumSet<E> to;
    
    /**
     *
     */
    public Transition () {
    }    
    
    /**
     *
     * @param label
     */
    public Transition (E label) {
        this.from = label;
    }   
    
    /**
     *
     * @param e1
     * @return
     */
    public Transition to(E... es) {
        to = noneOf(es[0].getDeclaringClass());
        
        for (E e: es) {
            to.add(e);
        }
        
        return this;
    }

    /**
     *
     * @param e1
     * @return
     */
    public boolean isAnAuthorizedTransition(E e1) {
        return (to!=null && to.contains(e1));
    }

    /**
     *
     * @return
     */
    public E getFrom() {
        return from;
    }

    /**
     *
     * @return
     */
    public EnumSet<E> getTo() {
        return to;
    }
    
    /**
     *
     * @return
     */
    public boolean isFinal() {
        return ((to == null ) || ( to.isEmpty()));
    }       

}
