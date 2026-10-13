public class Dot3 extends Dot2 {
    private double z;

    public double getZ() {
        return z;
    }

    public Dot3(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("{%.3f;%.3f;%.3f}", this.getX(), this.getY(), this.z);
    }
}
