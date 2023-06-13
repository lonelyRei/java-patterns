public class Car implements ICar{
    private Integer speed;
    private Integer baggageWeight;
    public Car(Integer speed, Integer baggageWeight) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Скорость автомобиля должна быть положительной!");
        }

        if (baggageWeight <= 0) {
            throw new IllegalArgumentException("Грузоподъемность автомобиля должна быть положительной!");
        }

        this.baggageWeight = baggageWeight;
        this.speed = speed;
    }

    @Override
    public Integer getCarSpeed() {
        return this.speed;
    }

    @Override
    public Integer getCarBaggageWeight() {
        return this.baggageWeight;
    }
}
