package sem2.Classes;

import sem2.Interfaces.iActorBehaviour;
import sem2.Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    
    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName(); 

}
