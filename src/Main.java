import Shapes.Parallelogram;
import Shapes.Round;
import Shapes.Triangle;
import myArray.myArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        myArray array = new myArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        int[] mass = {1,2,3,4,5};
        System.out.println(array.equals(mass));
        //array.show();
       // System.out.println(array.size());
       // array.delete(2);
       // array.show();
        //System.out.println(array.size());
        //System.out.println(array.toString());
        //array.show();

    }


}
