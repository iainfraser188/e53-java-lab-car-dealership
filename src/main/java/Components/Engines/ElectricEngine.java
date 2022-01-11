package Components.Engines;

public class ElectricEngine extends Engine implements IElectric{

    public ElectricEngine(int capacity, int horsePower) {
        super(capacity, horsePower);
    }

    public String runsQuietly(String noise) {
        return "Engine running: " + noise;
    }
}
