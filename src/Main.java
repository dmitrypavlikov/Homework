import Shapes.Parallelogram;
import Shapes.Round;
import Shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Round round = new Round(5.5);
        System.out.println(round.perimeter());
        Triangle triangle = new Triangle(5.0, 2.0,3.0,4.0);
        System.out.println(triangle.perimeter());
        Parallelogram notSquare = new Parallelogram(5.0, 3.0, 4.0);
        System.out.println(notSquare.perimeter());


    }
}
