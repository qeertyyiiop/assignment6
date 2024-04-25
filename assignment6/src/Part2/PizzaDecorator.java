package Part2;

abstract class PizzaDecorator extends Pizza{
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        super(pizza.getPrice());
        this.pizza = pizza;
    }

    public double getPrice(){
        return pizza.getPrice();
    }
}
