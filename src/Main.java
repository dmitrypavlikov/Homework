import Robot.Trash;
import Robot.LeftLeg;
import Robot.LeftHand;
import Robot.RightLeg;
import Robot.RightHand;
import Robot.Processor;




public class Main {
    public static void main(String[] args) {

     Trash LeftLeg = new LeftLeg();
     Trash LeftHand = new LeftHand();
     Trash RightLeg = new RightLeg();
     Trash RightHand = new RightHand();
     Processor Processor = new Processor();
     Processor.move(LeftHand);
     Processor.move(RightLeg);
     Processor.move(RightHand);






    }


}
