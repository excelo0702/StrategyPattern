import DuckCategory.Duck;
import DuckCategory.RubberDuck;
import DuckCategory.SeaDuck;
import Fly.FlyNoWay;
import Fly.FlyWithWings;
import Quack.MuteQuack;

public class DuckSimulator {
    public static void main(String[] args){
//        Duck rubberDuck = new RubberDuck();
//        rubberDuck.performFly();
//        rubberDuck.performQuack();

        Duck seaBabyDuck = new SeaDuck();
        seaBabyDuck.setFlyBehavior(new FlyNoWay());
        seaBabyDuck.setQuackBehavior(new MuteQuack());
        seaBabyDuck.performFly();
        seaBabyDuck.performQuack();

        // Baby duck has grown up now
        System.out.println("\n\n\n----------Baby Duck has grown now-----------\n\n\n");
        seaBabyDuck.setFlyBehavior(new FlyWithWings());
        seaBabyDuck.performFly();
        seaBabyDuck.performQuack();
    }
}
