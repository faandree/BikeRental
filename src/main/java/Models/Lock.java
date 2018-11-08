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
    public String toString() {
        return "Lock{" +
                "IDLock=" + IDLock +
                ", InUse=" + InUse +
                ", bike=" + bike +
                '}';
    }
}
