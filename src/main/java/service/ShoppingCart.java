package service;
import model.Food;

public class ShoppingCart {
    private Food[] items;
    public ShoppingCart(Food[] items){
        this.items = items;
    }

    public double totalPrice(){
        double totalPrice = 0;
        for(Food item : items){
            totalPrice += item.total();
        }
        return totalPrice;
    }

    public double totalPriceWithDiscount(){
        double totalPrice = 0;
        for(Food item : items){
            double discount = item.getDiscount();
            if (discount > 0) {
                totalPrice += (item.total() * (100 - discount) / 100);
            } else {
                totalPrice += item.total();
            }
        }
        return totalPrice;
    }

    public double totalPriceIsVegetarian(){
        double totalPrice = 0;
        for(Food item : items){
            if(item.isVegetarian()){
                totalPrice += item.total();
            }
        }
        return totalPrice;
    }
}
