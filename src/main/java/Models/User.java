package Models;

public class User {

    private int IDUser;
    private String name;

    private float credit;
    private int numRentals;
    private int rentalProgram;


    private Bike bike;
    private int startRental;


    public User(int IDUser, String name, int rentalProgram) {
        this.IDUser = IDUser;
        this.name = name;
        this.credit = 0;
        this.numRentals = 0;
        this.rentalProgram = rentalProgram;
        this.bike = null;
        this.startRental = -1;
    }

    /**
     *
     * @return id do utilizador
     */
    public int getIDUser() {
        return IDUser;
    }

    /**
     *
     * @param IDUser id do utilizador
     */
    public void setIDUser(int IDUser) {
        this.IDUser = IDUser;
    }

    /**
     *
     * @return nome do utilizador
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name nome do utilizador
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return crédito do utilizador
     */
    public float getCredit() {
        return this.credit;
    }

    /**
     *
     * @param credit crédito do utilizador
     */
    public void setCredit(float credit) {
        this.credit = credit;
    }

    /**
     *
     * @return bicicleta em uso pelo utilizador
     */
    public Bike getBike() {
        return bike;
    }

    /**
     *
     * @param bike bicicleta em uso pelo utilizador
     */
    public void setBike(Bike bike) {
        this.bike = bike;
    }

    /**
     *
     * @return início do aluger do utilizador
     */
    public int getStartRental() {
        return startRental;
    }

    /**
     *
     * @param startRental início do aluger do utilizador
     */
    public void setStartRental(int startRental) {
        this.startRental = startRental;
    }

    /**
     *
     * @return número de alugueres do utilizador
     */
    public int getNumRentals() {
        return numRentals;
    }

    /**
     * Incremento número de alugueres do utilizador
     */
    public void increaseNumRentals() {
        this.numRentals++;
    }

    /**
     *
     * @return tarifário de aluger do utilizador
     */
    public int getRentalProgram() {
        return rentalProgram;
    }

    /**
     *
     * @param rentalProgram tarifário de aluger do utilizador
     */
    public void setRentalProgram(int rentalProgram) {
        this.rentalProgram = rentalProgram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (IDUser != user.IDUser) return false;
        if (credit != user.credit) return false;
        if (numRentals != user.numRentals) return false;
        if (rentalProgram != user.rentalProgram) return false;
        if (startRental != user.startRental) return false;
        if (!name.equals(user.name)) return false;
        return bike.equals(user.bike);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String
    toString() {
        return "User{" +
                "IDUser=" + IDUser +
                ", name='" + name + '\'' +
                ", credit=" + credit  +
                ", bike=" + bike +
                ", numRentals=" + numRentals +
                '}';
    }
}
