package sem2;

import sem2.Classes.ActionClient;
import sem2.Classes.Market;
import sem2.Classes.OrdinaryClient;
import sem2.Classes.SpecialClient;
import sem2.Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
    //    Market market = new Market();
    //    OrdinaryClient client1 = new OrdinaryClient("Boris");
    //    OrdinaryClient client2 = new OrdinaryClient("Dasha");
    //    SpecialClient client3 = new SpecialClient("Fedor", 1101);
    //    market.acceptToMarket(client1);
    //    market.acceptToMarket(client2);
    //    market.acceptToMarket(client3);
    //    market.update();

       Market market = new Market();
       iActorBehaviour item1 = new OrdinaryClient("Boris");
       iActorBehaviour item2 = new SpecialClient("Fedor", 1101);
       iActorBehaviour item3 = new OrdinaryClient("Dasha");

       iActorBehaviour item4 = new ActionClient("Human1", "CashBack");
       iActorBehaviour item5 = new ActionClient("Human2", "CashBack");
       iActorBehaviour item6 = new ActionClient("Human3", "CashBack");

       market.acceptToMarket(item1);
       market.acceptToMarket(item2);
       market.acceptToMarket(item3);
       
       market.acceptToMarket(item4);
       market.acceptToMarket(item5);
       market.acceptToMarket(item6);

       market.update();
    }
}