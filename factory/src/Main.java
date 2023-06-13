public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop(new SimpleCoffeeFactory());
        try {
            coffeeShop.orderCoffee(CoffeeType.AMERICANO);
            coffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
            coffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);
            coffeeShop.orderCoffee(CoffeeType.ESPRESSO);

            coffeeShop.orderCoffee(CoffeeType.AMERICANO);
            coffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
            coffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);
            coffeeShop.orderCoffee(CoffeeType.ESPRESSO);

            coffeeShop.orderCoffee(CoffeeType.AMERICANO);
            coffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
            coffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);
            coffeeShop.orderCoffee(CoffeeType.ESPRESSO);

            coffeeShop.orderCoffee(CoffeeType.AMERICANO);
            coffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
            coffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);
            coffeeShop.orderCoffee(CoffeeType.ESPRESSO);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}