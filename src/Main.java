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

        myArray array2 = new myArray();
        array2.add(1);
        array2.add(2);
        array2.add(3);
        array2.add(4);
        array2.add(5);

       System.out.println(array.equals(array2));
        //array.show();
       // System.out.println(array.size());
       // array.delete(2);
       // array.show();
        //System.out.println(array.size());
        //System.out.println(array.toString());
        //array.show();

    }


}
