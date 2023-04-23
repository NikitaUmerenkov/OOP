package sem1.VendingMashines;

import sem1.Products.Products;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    
    private int volume;
    private List<Products> products;// = new ArrayList<Product>();
    private List<String> workLog;// = new ArrayList<String>();

    public VendingMachine(int volume){
        this.volume = volume;
        products = new ArrayList<Products>();
        workLog = new ArrayList<String>();
    }

    public void addProduct(Products prod)
    {
        products.add(prod);
    }

    public void addSales(String line)
    {
        workLog.add(line);
    }

    public Products getProdByName(String name)
    {
        for(Products prod: products)
        {
            if(prod.getName().contains(name))
            {
                return prod;
            }
        }
        return null;
    }

    public List<Products> getProdAll()
    {
        return products;
    }

}