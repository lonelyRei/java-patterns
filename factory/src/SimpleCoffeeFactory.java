public class SimpleCoffeeFactory {
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = switch (type) {
            case AMERICANO -> new Americano();
            case ESPRESSO -> new Espresso();
            case CAPPUCCINO -> new Cappuccino();
            case CAFFE_LATTE -> new CaffeLatte();
        };

        return coffee;
    }
}