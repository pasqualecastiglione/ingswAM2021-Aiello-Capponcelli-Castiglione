package it.polimi.ingsw.server.model;

/**
 * Generic Depot without any specialization
 */

public abstract class Depot {

    public void add(ResourceType resource, int numResource) throws DepotException {
    }
    public void remove(ResourceType resource, int numResource) throws DepotException {
    }
    public int getResourceCount(){
        return 0;
    }
}
