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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bike)) return false;

        Bike bike = (Bike) o;

        if (IDBike != bike.IDBike) return false;
        return InUSe == bike.InUSe;
    }

    @Override
    public int hashCode() {
        int result = IDBike;
        result = 31 * result + (InUSe ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "IDBike=" + IDBike +
                ", InUSe=" + InUSe +
                '}';
    }
}

