package Components;

public class GearBox {

    private boolean manualGears;
    private int noOfGears;

    public GearBox(boolean manualGears, int noOfGears){
        this.manualGears = manualGears;
        this.noOfGears = noOfGears;

    }

    public boolean getManualGears() {
        return this.manualGears;
    }

    public int getNoOfGears(){
        return this.noOfGears;
    }
}
