package Interfaces;

import Exceptions.UserAlreadyExists;

public interface AdministratorInterface {

    public void registerUser(int IDUser, String name, int rentalProgram) throws UserAlreadyExists;
    public void addBicycle(int idDeposit, int idLock, int idBike);
    public void addCredit(int idUser, int amount);
    public void addLock(int idDeposit, int idLock);

}
