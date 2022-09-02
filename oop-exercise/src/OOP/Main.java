package OOP;



import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Select your shape \n1.Square \n2.Rectangle \n3.Circle");
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        Scanner data = new Scanner(System.in);

        if(select == 1){


            Squares s = new Squares();
            System.out.println("Enter Width");
            double data1 = data.nextDouble();
            System.out.println("Enter Height");
            double data2 = data.nextDouble();
            s.width = data1;
            s.height = data2;
            s.Area();
            s.Perimeter();
        } else if (select == 2) {
            Rectangles r = new Rectangles();
            System.out.println("Enter Width");
            double data1 = data.nextDouble();
            System.out.println("Enter Height");
            double data2 = data.nextDouble();
            r.width = (int) data1;
            r.height = (int) data2;
            r.Area();
            r.Perimeter();

        } else if (select == 3) {
            Circles c = new Circles();
            System.out.println("Enter Radius");
            double data1 = data.nextDouble();
            c.radius = data1;
            c.Area();
            c.Perimeter();
        } else {
            System.out.println("Invalid Choice");
        }



    }
}
