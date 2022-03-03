package DuckCategory;

import Fly.FlyWithWings;
import Quack.LoudQuack;

public class SeaDuck extends Duck{

    public SeaDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new LoudQuack());
    }

    @Override
    public void display() {
        System.out.println("I am Sea Duck");
    }
}
