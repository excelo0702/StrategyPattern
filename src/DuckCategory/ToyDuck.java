package DuckCategory;

import Fly.FlyNoWay;
import Quack.LoudQuack;

public class ToyDuck extends Duck {
    public ToyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new LoudQuack());
    }

    @Override
    public void display() {
        System.out.println("Hey!!! I am Toy Duck");
    }
}
