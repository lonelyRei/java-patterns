public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр
        Phone phone = Phone.getInstance();

        // Отправляем сообщение
        try {
            phone.sendMessage("Друг", "rtw?");
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Пожалуйста, пополните баланс!");
        }


        // Пробуем создать еще один экземпляр
        Phone phone2 = Phone.getInstance();

        // Проверяем баланс
        System.out.println("Баланс: " + phone2.getBalance());
    }
}