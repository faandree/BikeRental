package Models;

public class Bike {

    private int IDBike;
    private boolean InUSe;

    public Bike(int IDBike) {
        this.IDBike = IDBike;
        this.InUSe = false;
    }

    public int getIDBike() {
        return IDBike;
    }

    public void setIDBike(int IDBike) {
        this.IDBike = IDBike;
    }

    public boolean isInUSe() {
        return InUSe;
    }

    public void setInUSe(boolean inUSe) {
        InUSe = inUSe;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "IDBike=" + IDBike +
                ", InUSe=" + InUSe +
                '}';
    }
}

