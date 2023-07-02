package OOP;

public class Buyer extends User{
    private CreditCardType card;
    private String cardNumber;
    private double moneyType;

    public Buyer(CreditCardType card, String cardNumber, double moneyType) {
        this.card = card;
        if (cardNumber.length() == 16)
            this.cardNumber = cardNumber;
        else
            System.out.println("Incorrect card number");
        this.moneyType = moneyType;
    }

    public Buyer(String FIO, long IIN, String phoneNumber, CreditCardType card, String cardNumber, double moneyType) {
        super(FIO, IIN, phoneNumber);
        this.card = card;
        this.cardNumber = cardNumber;
        this.moneyType = moneyType;
    }

    public CreditCardType getCard() {
        return card;
    }

    public void setCard(CreditCardType card) {
        this.card = card;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(double moneyType) {
        this.moneyType = moneyType;
    }

    @Override
    void changeNumber(String number) {
        setPhoneNumber(number);
    }

    @Override
    void changeFIO(String data) {
        setFIO(data);

    }
}
