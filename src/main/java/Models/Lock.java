package Models;

public class Lock {

    private int IDLock;
    private boolean InUse;
    private Bike bike;

    public Lock(int IDLock) {
        this.IDLock = IDLock;
        this.InUse = false;
        this.bike = null;
    }

    public void open(){
        this.InUse = true;
    }

    public void close(){
        this.InUse = true;
    }

    public int getIDLock() {
        return IDLock;
    }

    public void setIDLock(int IDLock) {
        this.IDLock = IDLock;
    }

    public boolean isInUse() {
        return InUse;
    }

    public void setInUse(boolean inUse) {
        InUse = inUse;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lock)) return false;

        Lock lock = (Lock) o;

        if (IDLock != lock.IDLock) return false;
        if (InUse != lock.InUse) return false;
        return bike.equals(lock.bike);
    }

    @Override
    public int hashCode() {
        int result = IDLock;
        result = 31 * result + (InUse ? 1 : 0);
        result = 31 * result + bike.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Lock{" +
                "IDLock=" + IDLock +
                ", InUse=" + InUse +
                ", bike=" + bike +
                '}';
    }
}
