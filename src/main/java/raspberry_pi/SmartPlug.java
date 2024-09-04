package raspberry_pi;

public class SmartPlug extends Device {
    public SmartPlug(String id, String name, Boolean isSensor, Boolean isSwitch) {
        super(id, name);
        this.isSensor = true;
        this.isSwitch = true;
    }

    @Override
    public REQUEST_STATUS performAction(String action) {
        return REQUEST_STATUS.COMPLETED;
        // Implement smart plug specific actions
    }
}
