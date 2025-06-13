<<<<<<< HEAD
import java.sql.Date;
=======
public class Customer {
    String userName;
    char gender; // M or F
    String phoneNumber;
    String address;
    String registerDATE;
    String dob;
    int loyalty_points;
>>>>>>> 75bf279625213463b28136f945920f146e23d249

public class Customer {
    private String userName;
    private char gender; // M or F
    private String phoneNumber;
    private String address;
    private String registerDate;
    private Date dob;
    private int loyaltyPoints;
    private String password;

    //cons
    public Customer(String userName, char gender, String phoneNumber, String address, String registerDate, String dob, String password) {
        this.userName = userName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.registerDate = registerDate;
        this.dob = dob;
        this.password = password;
        this.loyaltyPoints = 0;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getRegisterDate() {
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addPoints(int points) {
        this.loyaltyPoints += points;
    }
}
