package pl.mtopol.creditcard;
import org.junit.Assert;
import org.junit.Test;
public class CreditCardTest {
    @Test
    public void assignLimitToCard() {
        CreditCard creditCard = new CreditCard();
        creditCard.assignLimit(2000);
        Assert.assertTrue(creditCard.getLimit() == 2000);
    }
}