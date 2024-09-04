package raspberry_pi;

public abstract class InputDevice extends Device {
    protected InputDevice(String id, String name, Boolean isSensor, Boolean isSwitch) {
        super(id, name);
        this.isSensor = true;
        this.isSwitch = false;
    }
}
