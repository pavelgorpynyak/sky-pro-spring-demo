package pro.sky.skyprospringdemo;

public class TruckDriver extends Driver {

    public TruckDriver( String name, String surname, String driverLicence, int professionNumber ) {
        super(name, surname, driverLicence, professionNumber);
    }

    public void setDriveLicence( String driveLicence ) {
        if (driveLicence != null && driveLicence.startsWith("2")) {
            super.setDriverLicence(driveLicence);
        }
    }
}
