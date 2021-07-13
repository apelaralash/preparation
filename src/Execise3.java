import java.util.Scanner;

public class Execise3 {
    public static class Vector {
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

        public void set(){
            System.out.println("Введите начало вектора: \nx1 = ");
            Scanner console = new Scanner(System.in);
            this.x1 = console.nextDouble();
            System.out.println("y1 = ");
            this.y1 = console.nextDouble();
            System.out.println("Введите конец вектора: \nx2 = ");
            this.x2 = console.nextDouble();
            System.out.println("y2 = ");
            this.y2 = console.nextDouble();
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
            return "Vector{" +
                    "(" + x1 +
                    ", " + y1 +
                    "), (" + x2 +
                    ", " + y2 +
                    ")}";
        }
    }

    public static void main(String[] args) {
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        System.out.println("Первый вектор:");
        v1.set();
        System.out.println("Второй вектор:");
        v2.set();
        System.out.println(v1.toString());
        System.out.println(v1.length());
        System.out.println(v2.toString());
        System.out.println(v2.length());
        System.out.println(v1.mult(v2).toString());
        System.out.println(v2.mult(v1).toString());
    }
}
