package raspberry_pi;

public abstract class OutputDevice extends Device {
    protected OutputDevice(String id, String name, Boolean isSensor, Boolean isSwitch) {
        super(id, name);
        this.isSensor = false;
        this.isSwitch = true;
    }
}
