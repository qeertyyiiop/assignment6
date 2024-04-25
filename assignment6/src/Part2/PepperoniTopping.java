package Part2;

class PepperoniTopping extends PizzaDecorator {
    public PepperoniTopping(Pizza pizza) {
        super(pizza);
        this.price = 200; // Price of pepperoni topping
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + price;
    }
}

