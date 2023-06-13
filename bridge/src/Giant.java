public class Giant extends Bicycle {
    private final String mark;

    public Giant(Color color) {
        super(color);
        this.mark = "Giant";
    }

    @Override
    public void makeBicycle() {
        System.out.println("Собираем велосипед марки: " + this.mark);
    }

    @Override
    public void fillBicycleWithColor() {
        System.out.println("Окрашиваем велосипед марки: " + this.mark);
        color.fillColor();
    }
}