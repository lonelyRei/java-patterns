public class Main {
    public static void main(String[] args) {
        Car simpleCar = null;
        try {
            simpleCar = new Car(0, 1000);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("Создан автомобиль со статистиками (скорость: 100, грузоподъемнность: 100)");
            simpleCar = new Car(100, 100);
        }

        System.out.println("Скорость обычной машины - " + simpleCar.getCarSpeed());
        System.out.println("Грузоподъемность обычной машины - " + simpleCar.getCarBaggageWeight());

        ICar sportCar = new SportCar(simpleCar);

        System.out.println("Скорость спорткара - " + sportCar.getCarSpeed());
        System.out.println("Грузоподъемность спорткара - " + sportCar.getCarBaggageWeight());

        ICar truck = new Truck(simpleCar);

        System.out.println("Скорость грузовика - " + truck.getCarSpeed());
        System.out.println("Грузоподъемность грузовика - " + truck.getCarBaggageWeight());
    }
}