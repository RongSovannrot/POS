import java.sql.Date;
import java.time.LocalDate;

public class Customer {
    private String name;
    private String phoneNumber;
    private String address;
    private Date registerDate;
    private int totalBuy;
    private Date dob;
    private int loyaltyPoints;
    private String password;

    //cons for register
    public Customer(String name, String phoneNumber, String address, String password, Date dob) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.address = address;
        this.dob = dob;
        this.registerDate = new Date(System.currentTimeMillis());
        this.loyaltyPoints = 0;
        this.totalBuy = 0;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public Date getDob() {
        return dob;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public String getPassword() {
        return password;
    }

    public int getTotalBuy() {
        return totalBuy;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addPoints(int points) {
        this.loyaltyPoints += points;
    }
    public void rewardPoints(Product product, double totalPurchase) {
        int totalPoints = 0;

        //points from product reward
        totalPoints += product.getLoyaltyPointReward();

        //points from customer’s birthday
        if (isBirthdayToday()) {
            totalPoints += 20;
        }

        //points from every 10 purchases
        this.totalBuy++;
        if (this.totalBuy % 10 == 0) {
            totalPoints += 10;
        }

        //add total points
        this.loyaltyPoints += totalPoints;
    }

    private boolean isBirthdayToday() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = dob.toLocalDate();
        return today.getDayOfMonth() == birthDate.getDayOfMonth() && today.getMonthValue() == birthDate.getMonthValue();
    }

}
