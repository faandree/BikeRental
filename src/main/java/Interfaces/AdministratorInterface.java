package Interfaces;

import Exceptions.UserAlreadyExists;
import Models.Bike;
import Models.Deposit;
import Models.User;

import java.util.List;

public interface AdministratorInterface {

    /**
     * Registo de utilizador no sistema Bicycle Rentals
     *
     * @param IDUser - id do utilizado
     * @param name - nome do utilizador
     * @param rentalProgram - tarifário de aluguer 1 ou 2
     * @throws UserAlreadyExists - Se utilizador com o mesmo id já existir no sistema a excepção é lançada
     */
    public void registerUser(int IDUser, String name, int rentalProgram) throws UserAlreadyExists;

    /**
     * Adicção de depositos e locks ao sistema Bicycle Rentals.
     * Para a sua crição apenas é necessário indicar um id não existente no sistema.
     *
     * @param idDeposit - id de deposito existente ou deposito a criar
     * @param idLock - id de cadeado exisitente ou a criar
     */
    public void addLock(int idDeposit, int idLock);

    /**
     * Adicção de depositos, locks e bicicletas ao sistema Bicycle Rentals.
     * Para a sua crição apenas é necessário indicar um id não existente no sistema.
     *
     * @param idDeposit - id de deposito existente ou deposito a criar
     * @param idLock - id de cadeado exisitente ou a criar
     * @param idBike - id de bicicleta existente ou a criar
     */
    public void addBicycle(int idDeposit, int idLock, int idBike);

    /**
     * Adição de crédito à conta de um utilizador
     *
     * @param idUser - id do utilizador
     * @param amount - quantia a adicionar
     */
    public void addCredit(int idUser, int amount);

    /**
     *
     * @return lista de utilizadores no sistema Bicycle Rentals
     */
    public List<User> getUsers();

    /**
     *
     * @return lista de depositos no sistema Bicycle Rentals
     */
    public List<Deposit> getDeposits();

    /**
     *
     * @return lista de bicicletas no sistema Bicycle Rentals
     */
    public List<Bike> getBikes();

}
