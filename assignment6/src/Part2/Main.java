package Part2;

public class Main {
    public static void main(String[] args){
        Pizza basicPizza = new Pizza(2390);

        Pizza pepperoniPizza = new PepperoniTopping(basicPizza);
        Pizza mushroomPepperoniPizza = new MushroomTopping(pepperoniPizza);

        System.out.println("Price of Mushroom Pepperoni Pizza: $" + mushroomPepperoniPizza.getPrice());
    }
}
