package Models;

public class User {

    private int IDUser;
    private String name;

    private int credit;
    private int numRentals;
    private int rentalProgram;

    private Bike bike;
    private int startRental;


    public User(int IDUser, String name, int rentalProgram) {
        this.IDUser = IDUser;
        this.name = name;
        this.credit = 0;
        this.numRentals = 0;
        this.rentalProgram = rentalProgram;
        this.bike = null;
        this.startRental = -1;
    }

    public int getIDUser() {
        return IDUser;
    }

    public void setIDUser(int IDUser) {
        this.IDUser = IDUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return this.credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }


    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public int getStartRental() {
        return startRental;
    }

    public void setStartRental(int startRental) {
        this.startRental = startRental;
    }

    public int getNumRentals() {
        return numRentals;
    }

    public void increaseNumRentals() {
        this.numRentals++;
    }

    public int getRentalProgram() {
        return rentalProgram;
    }

    public void setRentalProgram(int rentalProgram) {
        this.rentalProgram = rentalProgram;
    }

    @Override
    public String
    toString() {
        return "User{" +
                "IDUser=" + IDUser +
                ", name='" + name + '\'' +
                ", credit=" + credit  +
                ", bike=" + bike +
                ", numRentals=" + numRentals +
                '}';
    }
}
