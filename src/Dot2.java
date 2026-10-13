public class Dot2 {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

     public Dot2(double x, double y){
        this.x = x;
        this.y = y;
     }

    @Override
    public String toString() {
        return String.format("{%.3f;%.3f}", this.x, this.y);
    }
}
