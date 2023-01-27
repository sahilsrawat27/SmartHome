public class SmartDevice {
    public String deviceStatus;
    public String deviceType;
    public SmartDevice(String name, String category) {
        deviceStatus = "online";
        deviceType = "unknown";
    }
    public void turnOn() {
        deviceStatus = "on";
    }
    public void turnOff() {
        deviceStatus = "off";
    }
}
public class SmartTvDevice entends
    SmartDevice {

    override val deviceType: String = "Smart TV"

    private var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    private var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }
