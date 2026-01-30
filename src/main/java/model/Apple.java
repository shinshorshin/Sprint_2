package model;

import model.constants.Colour;
import model.constants.Discount;

import java.awt.*;

public class Apple extends Food implements Discountable{
    String color;
    public Apple(int amount, double price, String color){
        super(amount, price, true);
        this.color = color;
    }
    @Override
    public double getDiscount() {
        if (Colour.RED.equals(color)) {
            return Discount.DISCOUNT;
        }
        return super.getDiscount();
    }
}
