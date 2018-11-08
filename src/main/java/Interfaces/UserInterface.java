package Interfaces;

public interface UserInterface {

    public int bicycleRentalFee(int rentalProgram, int initTime, int endTime, int nRentals);
    public int getBicycle(int IDDeposit, int IDUser, int startTime);
    public int returnBicycle(int IDDeposit, int IDUser, int endTime);
    public boolean verifyCredit(int IDUser);

}
