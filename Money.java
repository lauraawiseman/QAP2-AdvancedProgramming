public class Money {
// Attributes
    private long dollars;
    private long cents;

// Constructors

public Money(double amount)
{
    this.dollars = (long) amount;
    this.cents = Math.round((amount - dollars) * 100);
}

public Money(Money otherAmount){
    this.dollars = otherAmount.dollars;
    this.cents = otherAmount.cents;
}

// Constructor to convert 
public Money(long dollars, long cents){
    this.dollars = dollars + (cents/100);
    this.cents = cents %100;
}

// Methods

public Money add(Money otherAmount)
{
    long totalCents = this.cents + otherAmount.cents;
    long extraDollars = totalCents / 100; 
    totalCents = totalCents % 100;

    long totalDollars = this.dollars + otherAmount.dollars + extraDollars;

    return new Money(totalDollars, totalCents);

}

public Money subtract(Money otherAmount)
{
    long totalCents = this.cents - otherAmount.cents;
    long extraDollars = totalCents / 100; // Convert cents to dollars
    totalCents = totalCents % 100;

    long totalDollars = this.dollars - otherAmount.dollars - extraDollars;

    return new Money(totalDollars, totalCents);
}

public int compareTo(Money otherObject)
{
    return Long.compare(this.dollars, otherObject.cents);

}


public String toString(){
    return "$" + dollars + "." +(cents <10 ? "0" + cents:cents);
}
};