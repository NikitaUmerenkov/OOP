package sem2.Interfaces;

import java.util.List;

import sem2.Classes.Actor;

public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviour actor);
    void releaseFromMarket(List<Actor> actors);
    void update();    
}