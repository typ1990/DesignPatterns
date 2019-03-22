package eventlistener;

import java.util.EventObject;

/**
 * @author tianyongpeng
 */
public class DoorEvent extends EventObject {

    private String doorState = "";    // 表示门的状态，有“开”和“关”两种

    public DoorEvent(Object source) {
        super(source);
    }

    public void setDoorState(String doorState) {
        this.doorState = doorState;
    }

    public String getDoorState() {
        return this.doorState;
    }
}