package Components.Engines;

public class HybridEngine extends Engine implements IHybrid {

    public HybridEngine(int capacity, int horsePower) {
        super(capacity, horsePower);
    }

    public String runsSoftAndLoud(String noise) {
        return "Hybriddy " + noise + " noise";
    }
}
