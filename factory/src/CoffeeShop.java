public class CoffeeShop {

    private final SimpleCoffeeFactory coffeeFactory;
    private int countOfBeans;

    public CoffeeShop(SimpleCoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
        this.countOfBeans = 100;
    }

    public Coffee orderCoffee(CoffeeType type) throws ArithmeticException {

        if (this.countOfBeans < 10) {
            throw new ArithmeticException("Не удалось приготовить " + type + ". Не хватает кофейных зёрен.");
        }

        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        this.countOfBeans -= 10;

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }
}