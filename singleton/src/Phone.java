public class Phone {
    private static Phone instance;
    private static String name;
    private static Integer balance;

    private static Integer messagePrice = 5;

    Phone() {
        name = "Xiaomi";
        balance = 1000;
    }

    public static Phone getInstance() {
        if (instance == null) {
            System.out.println("Создаем экземпляр телефона Xiaomi, кладем на него сто рублей");
            instance = new Phone();
        }
        return instance;
    }

    public void sendMessage(String receiver, String message) throws ArithmeticException {
        if (balance - messagePrice > 0) {
            balance -= messagePrice;
            System.out.println("Отправляем сообщение: " + message + ", получатель: " + receiver);
        } else {
            throw new ArithmeticException("Баланс не может быть отрицательным!");
        }
    }

    public Integer getBalance() {
        return balance;
    }

    public void increaseBalance(Integer money) {
        balance += money;
        System.out.println("Вы положили: " + money + ", на счету: " + balance);
    }
}
