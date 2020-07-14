public class Door {

    private boolean isOpen;

    public Door() {
        this.isOpen = false;
    }

    public boolean openDoor() {
        if (this.isOpen) { 
            return false;
        } else {
            this.isOpen = true;
            return true;
        }
    }

    public boolean closeDoor()  {
        if (!this.isOpen) { 
            return false;
        } else {
            this.isOpen = false;
            return true;
        }
    }


}