package tasks.task3;

public class Vector {
    double x1, y1, x2, y2;

    Vector(){
        this.x1 = 0.0;
        this.y1 = 0.0;
        this.x2 = 0.0;
        this.y2 = 0.0;
    }

    Vector(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Vector mult(Vector v) {
        double resultX1 = (this.x2 - this.x1) * (v.y2 - v.y1);
        double resultY1 = (this.y2 - this.y1) * (v.x2 - v.x1);
        double resultX2 = (this.y2 - this.y1) * (v.x2 - v.x1);
        double resultY2 = (this.x2 - this.x1) * (v.y2 - v.y1);
        Vector resultV = new Vector(resultX1, resultY1, resultX2, resultY2);
        return resultV;
    }

    public double length(){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    @Override
    public String toString() {
        return "Начало (" +
                x1 + ", " + y1
                + "), Конец (" +
                x2 + ", " + y2 +
                ")}";
    }
}
