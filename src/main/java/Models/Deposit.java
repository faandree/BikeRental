package Models;

import java.util.ArrayList;
import java.util.List;

public class Deposit {

    private int IDDeposit;
    private List<Lock> locks;

    /**
     *
     * @param IDDeposit id do depósito a ser criado
     */
    public Deposit(int IDDeposit) {
        this.IDDeposit = IDDeposit;

        this.locks = new ArrayList<>();
    }

    /**
     *
     * @return id do depósito
     */
    public int getIDDeposit() {
        return IDDeposit;
    }

    /**
     *
     * @param IDDeposit id do depósito
     */
    public void setIDDeposit(int IDDeposit) {
        this.IDDeposit = IDDeposit;
    }

    /**
     *
     * @return
     */
    public List<Lock> getLocks() {
        return locks;
    }

    /**
     *
     * @param locks Lista de locks a colocar no depósito
     */
    public void setLocks(List<Lock> locks) {
        this.locks = locks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deposit)) return false;

        Deposit deposit = (Deposit) o;

        if (IDDeposit != deposit.IDDeposit) return false;
        return locks.equals(deposit.locks);
    }

    @Override
    public int hashCode() {
        int result = IDDeposit;
        result = 31 * result + locks.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "IDDeposit=" + IDDeposit +
                ", locks=" + locks +
                '}';
    }
}
