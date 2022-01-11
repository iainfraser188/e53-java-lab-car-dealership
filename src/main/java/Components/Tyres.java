package Components;

public class Tyres {

    private int gripScore;
    private double radius;


    public Tyres(int gripScore, double radius) {
        this.gripScore = gripScore;
        this.radius = radius;
    }

    public int getGripScore() {
        return this.gripScore;
    }


   public double getRadius(){
        return this.radius;
   }
}
