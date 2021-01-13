public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.length = length;
        this.width = width;
        if (length < 0) this.length = 0;
        if (width < 0) this.width = 0;
    }

    public double getArea () {
        return width * length;
    }
}
