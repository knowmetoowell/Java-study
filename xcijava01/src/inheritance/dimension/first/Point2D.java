package inheritance.dimension.first;

public abstract class Point2D {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void print() {
        System.out.println("x = " + this.getX());
        System.out.println("y = " + this.getY());
    }
    //    public Point2D(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
}
