public class VipCustomer {
    private String name;
    private String creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", "Default Limit", "defalutname@test.com");
    }

    public VipCustomer(String name, String creditLimit) {
        this(name,creditLimit,"user@email.com");
    }

    public VipCustomer(String name, String creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
