package raspberry_pi;

public abstract class Device {
    protected String name;
    protected String id;
    protected Boolean isSensor;
    protected Boolean isSwitch; //Find a better name

    protected Device(String name, String id) {
        this.name = name;
        this.id = id;
        this.isSensor = true;
        this.isSwitch = true;
    }

    public enum REQUEST_STATUS {
        RECEIVED,
        IN_PROGRESS,
        COMPLETED,
        FAILED,
        TIMEOUTED
    }

    public abstract REQUEST_STATUS performAction(String action);
}

