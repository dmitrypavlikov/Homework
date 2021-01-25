import Shapes.Parallelogram;
import Shapes.Round;
import Shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        /*Round round = new Round(5.5);
        System.out.println(round.perimeter());
        Triangle triangle = new Triangle(5.0, 2.0,3.0,4.0);
        System.out.println(triangle.perimeter());
        Parallelogram notSquare = new Parallelogram(5.0, 3.0, 4.0);
        System.out.println(notSquare.perimeter());*/
        myMath myMath1 = myMath.getInstance();
        myMath1.myMathInfo();
        System.out.println(myMath.exponentiation(8.0,4.0));
        System.out.println(myMath.factorial(5.0));
    }
}
