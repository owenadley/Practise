public abstract class Button {
    private boolean isLit;
    private Controller parent;
    
    public Button() {
        this.isLit = false;
        this.btnUp = false;
        this.btnDown = false;
        this.floor = false;
    }

    public abstract void sendRequest(int direction, boolean isFloor);
}

public class FloorBtn extends Button {
    public FloorBtn() {
        super();
    }

    @Override
    public void sendRequest(int direction, boolean isFloor) {

        controller.addRequest(direction, isFloor);

    }

    clickFloor(int floor) {
        sendReqest(floor, false);
    }
}

public class DirectionBtn extends Button {
    public DirectionBtn() {
        super();
    }

    @Override
    public void sendRequest(int direction, boolean isFloor) {

    }

    public void clickUp() {
        sendRequest(1, false);
    }

    public void clickDown() {
        sendRequest(0, false);
    }

}