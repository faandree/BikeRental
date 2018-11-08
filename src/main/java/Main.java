import Interfaces.AdministratorInterface;
import Interfaces.UserInterface;

public class Main {

    public static void main(String[] args) throws Exception {
        BikeRentalSystem bikeRental = new BikeRentalSystem(2);

        AdministratorInterface adminUI = (AdministratorInterface) bikeRental;
        adminUI.addBicycle(1,1,1);
        adminUI.addBicycle(1,2,2);
        adminUI.addBicycle(2,3,3);

        adminUI.registerUser(1,"me",1);
        adminUI.registerUser(2,"you",2);
        adminUI.addCredit(1,10);
        adminUI.addCredit(2,20);

        UserInterface userUI = (UserInterface) bikeRental;
        userUI.bicycleRentalFee(2,0,10,0);

        int bikeTaken = userUI.getBicycle(1,1, 0);
        System.out.println("\n\n\nBicycle: "+bikeTaken);
        userUI.getBicycle(2,2, 2);

        userUI.returnBicycle(2,1,3);

        userUI.returnBicycle(2,1,3);


        System.out.println(bikeRental.toString());
    }

}
