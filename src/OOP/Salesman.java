package OOP;

public class Salesman extends User{
    private BusinessType businessType;
    private long bankAccoun;
    private Laptop laptops [];
    private Mobile mobile [];

    public Salesman(BusinessType businessType, long bankAccoun, Laptop[] laptops, Mobile[] mobile) {
        this.businessType = businessType;
        this.bankAccoun = bankAccoun;
        this.laptops = laptops;
        this.mobile = mobile;
    }

    public Salesman(String FIO, long IIN, String phoneNumber, BusinessType businessType, long bankAccoun, Laptop[] laptops, Mobile[] mobile) {
        super(FIO, IIN, phoneNumber);
        this.businessType = businessType;
        this.bankAccoun = bankAccoun;
        this.laptops = laptops;
        this.mobile = mobile;
    }

    public BusinessType getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
    }

    public long getBankAccoun() {
        return bankAccoun;
    }

    public void setBankAccoun(long bankAccoun) {
        this.bankAccoun = bankAccoun;
    }

    public Laptop[] getLaptops() {
        return laptops;
    }

    public void setLaptops(Laptop[] laptops) {
        this.laptops = laptops;
    }

    public Mobile[] getMobile() {
        return mobile;
    }

    public void setMobile(Mobile[] mobile) {
        this.mobile = mobile;
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
