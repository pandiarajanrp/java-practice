public class BankAccount {
    private String customerName;
    private String email;
    private String phoneNumber;
    private int accountNumber;
    private float accountBalance;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public float deposit(float amount) {
        if (amount > 0) {
            this.accountBalance += amount;
        }
        return this.accountBalance;
    }

    public float withDrawl(float amount) {
        if (this.accountBalance >= amount) {
            this.accountBalance -= amount;
        }
        return this.accountBalance;
    }
}
