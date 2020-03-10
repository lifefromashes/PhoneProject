package PhoneAssignment;

public class IPhone extends Phone implements Ringable {

    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public void ring() {

    }

    @Override
    public void unlock() {

    }
}
