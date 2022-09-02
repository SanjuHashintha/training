package OOP;



class Squares {
    double height;
    double width;
    void Area() {
        double area;
        area = this.height * this.width;
        System.out.println("Shape: Square");
        System.out.println("Properties: \n" + "Length: " + height + "\nWidth: " + width);
        System.out.println("Area : "
                + area);
    }

    void Perimeter(){
        double perimeter;
        perimeter = 2 * (this.height + this.width);
        System.out.println("Perimeter : "
                + perimeter);
    }
}

class Rectangles extends Squares{
    @Override
    void Area() {
        super.Area();
    }

    @Override
    void Perimeter(){
        super.Perimeter();
    }
}