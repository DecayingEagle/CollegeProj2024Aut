package raspberry_pi;

import com.google.gson.Gson;

import java.util.List;
import java.util.UUID;

public class User {
    private String id;
    private List<Device> devices;

    public User(String id) {
        this.id = UUID.randomUUID().toString().replace("-", "").substring(0, 10);
        this.updateJSON();
    }

    public void toJSON (User user){
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);
    }

    public String getId() {
        return id;
    }
    
    public List<Device> getDevices() {
        return devices;
    }
    
    public void addDevice(Device device) {
        devices.add(device);
        updateJSON();
    }
    
    public void removeDevice(Device device) {
        devices.remove(device);
        updateJSON();
    }

    private void updateJSON () {
        toJSON(this);
    }
}