import java.util.Queue;

public class Elevator {
    private int currFloor;
    private int currDirection;  // 1 up 0 down
    private int isStopped;
    private Queue<Integer> nextFloors;
    private Door door;
    private Controller ctrl;


    public Elevator() {
        this.currFloor = 0;
        this.nextFloor = null;
        this.currDirection = null;
        this.isStopped = true;
        this.nextFloors = null;
    }

    public void goUp() {
        this.currDirection = 1;
    }
    public void goDown() {
        this.currDirection = 0;
    }    
    public void setCurrFloor(int floor) {
        this.currFloor = floor;
    }
    public void goToNextFloor() {

        int nextFloor = nextFloors.remove();

        if (this.nextFloor > this.currFloor) {
            while (this.currFloor != this.nextFloor) {
                goUp();
                this.currFloor += 1;
            }

            door.openDoor();
            this.isStopped = true;

        } else if (this.nextFloor < this.currFloor) {
            while(this.currFloor != this.nextFloor) {
                goDown();
                this.currFloor -= 1;
            }

            door.openDoor();
            this.isStopped = true;
        }
    }


/*     //elevator
        -currFloor
        -currDirection
        -nextFloors[]
        +goUp()
        +goDown()
        

    //door
        -isOpen
        +closeDoor()
        + openDoor()

    //observer
        +update()   //add next floor to elevator

    //elevator controller
        -requests[]
        -nextStop
        +addRequest(direciton)
        +addRequest(floor)
        +processRequest()
        +notifyObservers()

    // button
        -isLit
        +sendRequest()
        // ele btn
        -direction
        //floor btn
        -floor


    // light indicator
        -floor
        -arrow */


}