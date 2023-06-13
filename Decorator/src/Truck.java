public class Truck implements ICar {
    private Car car;

    public Truck(Car car) {
        this.car = car;
    }

    @Override
    public Integer getCarSpeed() {
        return this.car.getCarSpeed() - 40;
    }

    @Override
    public Integer getCarBaggageWeight() {
        return this.car.getCarBaggageWeight() + 3000;
    }
}