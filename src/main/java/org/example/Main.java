package org.example;

import model.*;
import model.constants.*;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
            var meat = new Meat(5, 100);
            var redApple = new Apple(10, 50, Colour.RED);
            var greenApple = new Apple(8, 60, Colour.GREEN);
            Food[] items = {meat, redApple, greenApple};
            ShoppingCart cart = new ShoppingCart(items);
            System.out.println("Общая сумма товаров в корзине без скидки: " + cart.totalPrice());
            System.out.println("Общая сумма товаров в корзине со скидкой: " + cart.totalPriceWithDiscount());
            System.out.println("Общая сумма вегетарианских товаров: " + cart.totalPriceIsVegetarian());
        }
    }
