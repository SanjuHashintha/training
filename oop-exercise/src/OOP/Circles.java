package OOP;

public class Circles {
    double radius;

    void Area() {
        double area;
        area = Math.PI * this.radius * this.radius;
        System.out.println("Shape: Circle");
        System.out.println("Properties: \n" + "Radius: " + radius);
        System.out.println("Area : "
                + area);
    }

    void Perimeter(){
        double perimeter;
        perimeter = 2 * Math.PI * this.radius;
        System.out.println("Perimeter : "
                + perimeter);
    }
}
