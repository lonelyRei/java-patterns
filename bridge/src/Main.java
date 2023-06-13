public class Main {
    public static void main(String[] args) {
        GT gtBike = new GT(new BlackColor());
        Norco norcoBike = new Norco(new WhiteColor());
        Giant giantBike = new Giant(new RedColor());

        // Собираем и окрашиваем велики
        gtBike.makeBicycle();
        gtBike.fillBicycleWithColor();
        System.out.println("================================");

        norcoBike.makeBicycle();
        norcoBike.fillBicycleWithColor();
        System.out.println("================================");

        giantBike.makeBicycle();
        giantBike.fillBicycleWithColor();
        System.out.println("================================");
    }
}

