import Shapes.Parallelogram;
import Shapes.Round;
import Shapes.Triangle;
import myArray.myArray;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
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
        */
        String data;
        Scanner scanner = new Scanner(System.in);
        data = scanner.nextLine();
        String[] mass = data.split(" ");
        if (mass.length != 3){
            System.out.printf("Error");
            System.exit(404);
        }
        else if ((Integer.valueOf(mass[1]) > 12 ) || (Integer.valueOf(mass[1]) <= 0)  && (Integer.valueOf(mass[2]) > 0)){
            System.out.printf("Error");
            System.exit(404);
        }
        else if (Integer.valueOf(mass[1]) == 2) {
            if ((Integer.valueOf(mass[2]) % 4 == 0) || (Integer.valueOf(mass[2]) % 400 == 0) && (Integer.valueOf(mass[2]) % 100 != 0)) {
                if ((Integer.valueOf(mass[0]) <= 29) && (Integer.valueOf(mass[0]) >= 1)){
                    System.out.printf("Exist");
                    System.exit(0);
                }
                else{
                    System.out.printf("Error");
                    System.exit(404);
                }
            }
            else if ((Integer.valueOf(mass[0]) <= 28) && (Integer.valueOf(mass[0]) >= 1)){
                System.out.printf("Exist");
                System.exit(0);
            }
            else{
                System.out.printf("Error");
                System.exit(404);
            }
        }
        else if(((Integer.valueOf(mass[1]) % 2 == 0) && (Integer.valueOf(mass[1]) <= 7)) || ((Integer.valueOf(mass[1]) % 2 != 0) && (Integer.valueOf(mass[1]) >= 8)))   {
            if ((Integer.valueOf(mass[0]) <= 30) && (Integer.valueOf(mass[0]) >= 1)){
                System.out.printf("Exist");
                System.exit(0);
            }
            else{
                System.out.printf("Error");
                System.exit(404);
            }

        }
        else if((Integer.valueOf(mass[0]) <= 31) && (Integer.valueOf(mass[0]) >= 1)){
            System.out.printf("Exist");
            System.exit(0);
        }
        else{
            System.out.printf("Error");
            System.exit(404);
        }






    }


}
