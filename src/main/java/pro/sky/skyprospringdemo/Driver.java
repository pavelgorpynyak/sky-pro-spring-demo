package pro.sky.skyprospringdemo;

public class Driver extends Person {
    private String driverLicence;

    public Driver( String name, String surname, String passport,String driverLicence, int professionNumber ) {
        super(name, surname, passport,professionNumber);
    }

    public String getDriverLicence() {
        return this.driverLicence = driverLicence;
    }

    public void setDriverLicence( String driverLicence ) {
        this.driverLicence = driverLicence;
    }
}
