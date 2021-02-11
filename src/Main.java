import Shapes.Parallelogram;
import Shapes.Round;
import Shapes.Triangle;
import myArray.myArray;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> arrayMask = new ArrayList<>();
        TreeSet<Integer> multiple = new TreeSet<>();
        for (int i = 0; i < n; i++){
            array.add(scanner.nextInt());
            arrayMask.add(array.get(i));
            multiple.add(array.get(i));
        }
        int min = multiple.first();
        int max = multiple.last();
        System.out.printf("Используются только первые " + n);
        if (multiple.size() > 2){
            System.exit(-1);
        }
        Collections.sort(arrayMask);
        for (int i = 0; i < n; i++){
            if(array.get(i) != arrayMask.get(i)){
                System.exit(-1);
            }
        }
        System.exit(max-min);






    }


}
