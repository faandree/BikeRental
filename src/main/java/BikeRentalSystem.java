import Exceptions.UserAlreadyExists;
import Interfaces.AdministratorInterface;
import Interfaces.UserInterface;
import Models.Bike;
import Models.Deposit;
import Models.Lock;
import Models.User;

import java.util.ArrayList;
import java.util.List;

public class BikeRentalSystem implements AdministratorInterface, UserInterface {

    private int rentalFee;

    private List<User> users;
    private List<Deposit> deposits;
    private List<Bike> bikes;

    public BikeRentalSystem(int rentalFee) {
        this.rentalFee = rentalFee;

        this.bikes = new ArrayList<>();
        this.deposits = new ArrayList<>();
        this.users = new ArrayList<>();
    }


    /**
     * User Interface
     */

    public int bicycleRentalFee(int rentalProgram, int initTime, int endTime, int nRentals) {
        int unitRate = this.rentalFee;
        int rentals = nRentals
                %10;
        int time = endTime-initTime;
        int fee = 0;
        if (rentalProgram == 1){
            return time * unitRate;
        }
        else if (rentalProgram ==2  && rentals != 0){
            if (time <= 10)
            { fee = unitRate* time;
                return fee;}
            if (time <= 100)
            { fee = 10*unitRate + (time-10)* unitRate/2;
                return fee;}
        }
        return 0;
    }

    public int getBicycle(int IDDeposit, int IDUser, int startTime) {
        Deposit d = findDeposit(IDDeposit);
        User u = findUser(IDUser);
        Bike b = null;
        if (d != null && u != null) {
            if (verifyCredit(IDUser)) {
                for (Lock l : d.getLocks()) {
                    if (l.isInUse()) {
                        b = l.getBike();
                        b.setInUSe(true);
                        u.setBike(b);
                        u.setStartRental(startTime);
                        l.setInUse(false);
                        l.setBike(null);
                        return b.getIDBike();
                    }
                }
            }
        }
        return -1;
    }


    public float returnBicycle(int IDDeposit, int IDBike, int endTime) {
        Deposit d = findDeposit(IDDeposit);
        User u = findUserByBike(IDBike);
        int payment=0;
        if (d != null && u != null && u.getBike() != null && u.getBike().isInUSe()){
            Bike b = u.getBike();
            for (Lock l : d.getLocks()){
                if (!l.isInUse()){
                    payment = bicycleRentalFee(u.getRentalProgram(),u.getStartRental(),endTime,u.getNumRentals());
                    u.setBike(null);
                    u.increaseNumRentals();
                    u.setCredit(u.getCredit()-payment);
                    u.setStartRental(-1);
                    l.setInUse(true);
                    b.setInUSe(false);
                    l.setBike(b);
                   return u.getCredit();
                }
            }
        }
        return -1;
    }


    private Deposit findDeposit(int IDDeposit){
        Deposit d = null;
        for(Deposit d_temp : this.deposits){
            if (d_temp.getIDDeposit() == IDDeposit){
                d = d_temp;
                break;
            }
        }
        return d;
    }


    private User findUser(int IDUser){
        User u = null;
        for(User u_temp : this.users){
            if (u_temp.getIDUser() == IDUser){
                u = u_temp;
                break;
            }
        }
        return u;
    }

    private Bike findBike(int IDBike){
        Bike b = null;
        for(Bike b_temp : this.bikes){
            if (b_temp.getIDBike() == IDBike){
                b = b_temp;
                break;
            }
        }
        return b;
    }

    public boolean verifyCredit(int IDUser){
        User u = findUser(IDUser);
        boolean resp = false;
        if (u!= null){
            if (u.getCredit() > 0 ){
                resp = true;
            }
        }
        return resp;
    }



    /*
    * Admin Interface
     */


    public void registerUser(int IDUser, String name, int rentalProgram) throws UserAlreadyExists {
        User u = findUser(IDUser);

        if ( u == null ){
            this.users.add(new User(IDUser,name,rentalProgram));
        } else {
            throw new UserAlreadyExists();
        }
    }


    public void addBicycle(int idDeposit, int idLock, int idBike) {
        Bike b = null;
        Deposit d =null;
        Lock l = null;

        for (Bike bike_temp : this.bikes){
            if (b != null && b.getIDBike() == idBike) {
                b = bike_temp;
            }
        }
        if (b== null){
            b = new Bike(idBike);
            this.bikes.add(b);
        }

        for(Deposit deposit_tmp : this.deposits) {
            if (deposit_tmp.getIDDeposit() == idDeposit) {
                d = deposit_tmp;
            }
        }
        if (d== null){
            d = new Deposit(idDeposit);
            this.deposits.add(d);
        }
        for(Lock lock_tmp : d.getLocks()) {
            if (lock_tmp.getIDLock() == idLock) {
                l = lock_tmp;
            }
        }
        if (l== null){
            l = new Lock(idLock);
            d.getLocks().add(l);
        }
        l.setBike(b);
        l.setInUse(true);

    }

    @Override
    public void addCredit(int idUser, int amount) {
        User u = findUser(idUser);
        if (u!=null && amount >0 && (u.getCredit() + amount >0)){
            u.setCredit(u.getCredit() + amount);
        }

    }


    public String toString() {
        return "BikeRentalSystem{\n" +
                "rentalFee=" + rentalFee +
                ", \nusers=" + users +
                ", \ndeposits=" + deposits +
                ", \nbikes=" + bikes +
                '}';
    }
}
