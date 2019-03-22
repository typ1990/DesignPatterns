package eventlistener;

/**
 * FrontDoorListener：事件监听器（event listener）
 *
 * @author tianyongpeng
 */
public class FrontDoorListener implements IDoorListener {
    /**
     * 做具体的开门，关门动作
     *
     * @param event
     */
    @Override
    public void dealDoorEvent(DoorEvent event) {
        if (event.getDoorState() != null && event.getDoorState().equals("open")) {
            System.out.println("前门打开");
        } else {
            System.out.println("前门关闭");
        }
    }
}