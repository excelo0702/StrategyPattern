package Quack;

public class LoudQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("know how to quack loudly ");
    }
}
