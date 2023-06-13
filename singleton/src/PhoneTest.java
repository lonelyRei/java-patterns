import org.junit.Assert;
import org.junit.Test;

public class PhoneTest {

    // Сравниваем начальный баланс
    @Test
    public void compareStartBalance() {
        Phone phone = new Phone();
        Integer balance = phone.getBalance();

        Integer expected = 1000;


        Assert.assertEquals(expected, balance);
    }


    // Сравниваем баланс после отправки сообщения
    @Test
    public void compareBalanceAfterMessage() {
        Phone phone = new Phone();
        phone.sendMessage("123", "13");
        Integer balance = phone.getBalance();

        Integer expected = 995;

        Assert.assertEquals(expected, balance);
    }

    // Сравниваем экземпляры
    @Test
    public void compareInstances() {
        Phone phone1 = Phone.getInstance();

        Phone phone2 = Phone.getInstance();

        Assert.assertEquals(phone1, phone2);
    }

    // Сравниваем балансы после пополнения
    @Test
    public void compareBalancesAfterIncrease() {
        Phone phone = Phone.getInstance();
        phone.increaseBalance(1000);

        Integer expected = 2000;

        Assert.assertEquals(expected, phone.getBalance());
    }

    // Сраниваем балансы после нескольких сообщений
    @Test
    public void compareBalancesAndInstancesAfterSeveralMessages() {
        Phone phone = Phone.getInstance();

        for (int i = 0; i < 5; i++) {
            phone.sendMessage("123", "123");
        }

        Phone phone2 = Phone.getInstance();

        Assert.assertEquals(phone2.getBalance(), phone.getBalance());
    }
}
