package Components.Engines;

public class PetrolEngine extends Engine implements IPetrol{

    public PetrolEngine(int capacity, int horsePower) {
        super(capacity, horsePower);
    }

    public String runsLoudly(String noise) {
        return "ENGINE RUNNING! " + noise + "!";
    }
}
