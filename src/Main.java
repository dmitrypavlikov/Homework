import Shapes.Parallelogram;
import Shapes.Round;
import Shapes.Triangle;
import myArray.myArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       try {
           int n = Integer.parseInt(scanner.nextLine());
       } catch (Exception e) {
           System.out.println("Несоответствие данных!");
       }
       String value = String.valueOf(scanner.nextLine());
       ArrayList mass = new ArrayList<String>(Integer.parseInt(value));
       for(int i = 0; i < value.length(); i++){
               if(value.charAt(i) != ' '){
                 try{
                     mass.add((int) value.charAt(i));
                 } catch (Exception e){
                     System.out.println("Несоответствие данных!");
                 }

               }


       }
       for(Integer k : mass ){
           System.out.println(k);
       }
    }


}
