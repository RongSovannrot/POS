public class Customer {
    String userName;
    char gender; // M or F
    String phoneNumber;
    String address;
    String registerDATE;
    String dob;
    String password;
    int loyalty_points;

    public Customer(String userName, char gender, String phoneNumber, String address, String registerDATE, String dob, String password,int loyalty_points) {
        this.userName = userName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.registerDATE = registerDATE;
        this.dob = dob;
        this.password = password;
        this.loyalty_points = loyalty_points;

    }
}