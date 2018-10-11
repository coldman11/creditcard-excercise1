package pl.mtopol.creditcard;

public class CreditCard
{
    private double limit;
    private boolean blocked = false;
    
    public void assignLimit(double limit)
    {
        this.limit = limit;
    }
    
    public double getLimit()
    {
        return this.limit;
    }
    
    public void blockCard()
    {
        this.blocked = true;
    }
}