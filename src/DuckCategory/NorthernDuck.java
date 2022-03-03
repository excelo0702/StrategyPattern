package DuckCategory;

import Fly.FlyWithWings;
import Quack.LoudQuack;

public class NorthernDuck extends Duck{

    public NorthernDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new LoudQuack());
    }
    @Override
    public void display() {
        System.out.println("I look like Northern Duck");
    }
}
