package Part2;

class MushroomTopping extends PizzaDecorator {
    public MushroomTopping(Pizza pizza) {
        super(pizza);
        this.price = 150; // Price of mushroom topping
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + price;
    }
}