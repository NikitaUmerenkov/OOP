package sem1.Products;

public class HotDrink extends Products {

    private int temp;
    private Double volume;

    public HotDrink(String name, Double price, Double volume, int temp){
        super(name, price);
        this.temp = temp;
        this.volume = volume;
        if((temp <= 0) || (temp >= 100)) {
            throw new IllegalStateException(String.format("Неверно указана температура"));
        }
    }

    public int getTemp(){
        return temp;
    }

    public void SetTemp(int value){
        if (value <=0) {
            throw new IllegalStateException(String.format("Неверно указана температура")); 
        }
        temp = value;
    }

    public Double getVolume(){
        return volume;
    }
    
    public void setVolume(Double value){
        volume = value;
    }
    @Override
    public String toString(){
        return "Product{" + "name='" + super.getName() + '\'' + ", cost=" + super.getPrice() 
        + ", volume=" + volume + ", temperature=" + temp + '}'; 
    }
}