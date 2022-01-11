package Components.Engines;

public class Engine {

    private int capacity;
    private int horsePower;

    public Engine(int capacity, int horsePower) {
        this.capacity = capacity;
        this.horsePower = horsePower;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getHorsePower() {
        return this.horsePower;
    }
}
