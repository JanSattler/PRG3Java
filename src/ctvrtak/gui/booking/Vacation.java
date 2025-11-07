package ctvrtak.gui.booking;

public class Vacation {
    String applicant, phoneNumber;
    Destination destination;
    int destinationOption;
    int days;
    boolean discount;

    public Vacation(String applicant, String phoneNumber, int destinationOption, int days, boolean discount) {
        this.applicant = applicant;
        this.phoneNumber = phoneNumber;
        this.destination = Destination.getDestByCode(destinationOption);
        this.days = days;
        this.discount = discount;
    }

    public String[] getTableRow() {
        return new String[]{
                applicant,
                phoneNumber,
                destination
        }
    }
}

enum Destination {
    BEACH("Beach"),
    CITY("City"),
    MOUNTAINS("Mountains");

    Destination(String i) {
    }

    public static Destination getDestByCode(int code) {
        switch (code) {
            case 0:
                return BEACH;
                //nemusim dát break když dam return
            case 1:
                return CITY;
            case 2:
                return MOUNTAINS;
            default:
                return CITY;
        }
    }
}
