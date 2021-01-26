import Shapes.Parallelogram;
import Shapes.Round;
import Shapes.Triangle;
import myArray.myArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        myArray array = new myArray();
        System.out.println(array.isEmpty());
        array.add(10);
        array.add(9);
        System.out.println(array.contains(11));
        System.out.println(array.isEmpty());

    }


}
