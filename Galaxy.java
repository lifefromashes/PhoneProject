package PhoneAssignment;

public class Galaxy extends Phone implements Ringable{

    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public void ring() {
        System.out.println("Ring! Ring! Ring!");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking via facial recognition.");
    }

    @Override
    public void displayInfo() {
        System.out.println("iPhoneX from AT&T");
    }
}
