public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

// Constructors
    public CreditCard(Person newCardHolder, Money limit){
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0);
    }

    public Money getBalance(){
        return new Money(balance);
    }

    public Money getCreditLimit(){
        return new Money(creditLimit);
    }

    public String getPersonals(){
        return owner.toString();
    }

    public void charge(Money amount){
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount); // Add amount to balance
            System.out.println("Charge sucessful.");
        }else {
            System.out.println("Charge denied: Over credit limit.");
        }
    }

    public void payment(Money amount){

    }



}


