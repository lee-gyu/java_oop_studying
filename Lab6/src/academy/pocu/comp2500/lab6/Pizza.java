package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class Pizza {

    private int price;
    private int maxMeatCount;
    private int maxCheeseCount;
    private int maxVeggieCount;
    protected int meatCount = 0;
    protected int cheeseCount = 0;
    protected int veggieCount = 0;
    protected ArrayList<Topping> toppings = new ArrayList<>();

    public Pizza(int price, int maxMeatCount, int maxCheeseCount, int maxVeggieCount) {
        this.price = price;
        this.maxMeatCount = maxMeatCount;
        this.maxCheeseCount = maxCheeseCount;
        this.maxVeggieCount = maxVeggieCount;
    }

    public boolean isValid() {
        return this.meatCount == this.maxMeatCount &&
                this.cheeseCount == this.maxCheeseCount &&
                this.veggieCount == this.maxVeggieCount;
    }

    public int getPrice() {
        return this.price;
    }

    public ArrayList<Topping> getToppings() {
        return this.toppings;
    }

    public boolean addTopping(Topping topping) {
        if ((isMeat(topping) && this.meatCount >= maxMeatCount)
                || (isVeggie(topping) && this.veggieCount >= maxVeggieCount)
                || (isCheese(topping) && this.cheeseCount >= this.maxCheeseCount)) {
            return false;
        }

        this.toppings.add(topping);

        if (isMeat(topping)) {
            ++this.meatCount;
        }

        if (isVeggie(topping)) {
            ++this.veggieCount;
        }

        if (isCheese(topping)) {
            ++this.cheeseCount;
        }

        return true;
    }

    public boolean removeTopping(Topping topping) {
        boolean isRemoved = this.toppings.remove(topping);

        if (isRemoved) {
            if (isMeat(topping)) {
                --this.meatCount;
            }

            if (isVeggie(topping)) {
                --this.veggieCount;
            }

            if (isCheese(topping)) {
                --this.cheeseCount;
            }
        }

        return isRemoved;
    }

    private static boolean isMeat(Topping topping) {
        return topping == Topping.BACON
                || topping == Topping.CHICKEN
                || topping == Topping.PEPERONI
                || topping == Topping.SAUSAGES
                || topping == Topping.HAM;
    }

    private static boolean isVeggie(Topping topping) {
        return topping == Topping.BLACK_OLIVES
                || topping == Topping.RED_ONIONS
                || topping == Topping.GREEN_PEPPERS;
    }

    private static boolean isCheese(Topping topping) {
        return topping == Topping.MOZZARELLA_CHEESE
                || topping == Topping.CHEDDAR_CHEESE
                || topping == Topping.FETA_CHEESE;
    }

}