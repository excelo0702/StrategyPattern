package DuckCategory;

import Fly.FlyNoWay;
import Quack.MuteQuack;

public class RubberDuck extends Duck{

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Hey buddy! I am Rubber Duck");
    }
}
