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
        this.days = days;
        this.discount = discount;
    }

    public String[] getTableRow() {

    }
}

enum Destination {
    BEACH(0),
    CITY(1),
    MOUNTAINS(2);

    Destination(int i) {
    }
}
