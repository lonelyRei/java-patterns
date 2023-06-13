public class SportCar implements ICar {
    private Car car;

    public SportCar(Car car) {
        this.car = car;
    }

    @Override
    public Integer getCarSpeed() {
        return this.car.getCarSpeed() + 100;
    }

    @Override
    public Integer getCarBaggageWeight() {
        return this.car.getCarBaggageWeight() - 500;
    }
}