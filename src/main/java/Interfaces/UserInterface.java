package Interfaces;

import Exceptions.UserDoesNotExists;

public interface UserInterface {

    /**
     * Cálculo do custo do aluguer com base no tarifário de aluguer.
     * O tempo é medido em unidades de tempo representados por números inteiros
     *
     * @param rentalProgram tarifário de aluguer, 1 ou 2
     * @param initTime - início do aluguer
     * @param endTime - fim do aluguer
     * @param nRentals - número de alugueres já feitos pelo utilizador
     * @return valor a pagar pelo aluguer com as características definidas
     */
    public int bicycleRentalFee(int rentalProgram, int initTime, int endTime, int nRentals);

    /**
     * Retirar uma bicicleta do deposito e iniciar o aluguer.
     * Requer que o utilizador tenha crédito positivo
     *
     * @param IDDeposit - id do deposito
     * @param IDUser - id do utilizador
     * @param startTime - unidade de tempo em que a bicicleta é levantada
     * @return id da bicicleta levantada
     * @throws UserDoesNotExists - excepção se o utilizador não existir
     */
    public int getBicycle(int IDDeposit, int IDUser, int startTime) throws UserDoesNotExists;

    /**
     * Faz o retorno da bicleta ao deposito e termina o aluguer.
     *
     * @param IDDeposit - id do deposito
     * @param IDUser - id do utilizador
     * @param endTime - unidade de tempo em que a bicicleta é levantada
     * @return id do lock onde a bicleta foi devolvida
     */
    public float returnBicycle(int IDDeposit, int IDUser, int endTime);

    /**
     * Verifica se o saldo da conta de um utilizador é positivo
     *
     * @param IDUser - id do utilizador
     * @return boleano indicando se existe crédito positivo na conta do utilizador
     */
    public boolean verifyCredit(int IDUser);

}
