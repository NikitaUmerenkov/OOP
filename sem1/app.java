package sem1;

import sem1.Products.BottleOfWater;
import sem1.Products.HotDrink;
import sem1.VendingMashines.VendingMachine;
import sem1.Products.Products;


public class app {
    public static void main(String[] args) throws Exception {

        Products item1 = new Products("Cola",88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new Products("Чипсы", 60.0));
        itemMachin.addProduct(new Products("Масло", 50.0));
        itemMachin.addProduct(new Products("Хлеб", 40.0));
        itemMachin.addProduct(new Products("Снек", 20.0));
        itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500 ));
        itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500 ));
        itemMachin.addProduct(new HotDrink("Tea", 100.0,100.0, 80 ));
        itemMachin.addProduct(new HotDrink("Coffe", 250.0,150.0, 80 ));

        for(Products prod: itemMachin.getProdAll())
        {
            System.out.println(prod.toString());
        }
       
    }
}