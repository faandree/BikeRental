import Interfaces.AdministratorInterface;
import Interfaces.UserInterface;

public class Main {

    public static void main(String[] args) throws Exception {
        //Criação do objecto bikeRentalSystem
       BikeRentalSystem bikeRental = new BikeRentalSystem(2);

       //Casting do objecto bikeReantal para as operações de Administrador
       AdministratorInterface adminUI = (AdministratorInterface) bikeRental;
      
       //Adição de utilizadores ao sistema
       adminUI.registerUser(1,"me",1);
       adminUI.registerUser(2,"you",2);

       // Adição de crédito ao utilizadores
       adminUI.addCredit(1,10);
       adminUI.addCredit(2,20);
      
       //adição de depositos com bicletas no sistema
       adminUI.addBicycle(1,1,1);
       adminUI.addBicycle(1,2,2);
       adminUI.addBicycle(2,3,3);
      
       //adição de depositos sem bicicletas no sistema
       adminUI.addLock(2,1);
       adminUI.addLock(2,2);
       adminUI.addLock(1,3);

       //Casting do objecto bikeReantal para as operações de Utilizador
       UserInterface userUI = (UserInterface) bikeRental;
      
       // calculo de aluguer com as condições especificadas
       userUI.bicycleRentalFee(2,0,10,0);

       // inicio do aluguer
       int bikeTaken = userUI.getBicycle(1,1, 0);
       int bikeTaken2 = userUI.getBicycle(2,2, 2);
      
       // fim do aluguer
       int lockReturned = userUI.returnBicycle(2,bikeTaken,3);
       int lockReturned2 =userUI.returnBicycle(2,bikeTaken2,3);


       System.out.println(bikeRental.toString());
    }

}
