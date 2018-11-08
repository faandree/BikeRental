package Models;

import java.util.ArrayList;
import java.util.List;

public class Deposit {

    private int IDDeposit;
    private List<Lock> locks;

    public Deposit(int IDDeposit) {
        this.IDDeposit = IDDeposit;

        this.locks = new ArrayList<>();
    }

    public int getIDDeposit() {
        return IDDeposit;
    }

    public void setIDDeposit(int IDDeposit) {
        this.IDDeposit = IDDeposit;
    }

    public List<Lock> getLocks() {
        return locks;
    }

    public void setLocks(List<Lock> locks) {
        this.locks = locks;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "IDDeposit=" + IDDeposit +
                ", locks=" + locks +
                '}';
    }
}
