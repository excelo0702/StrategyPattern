package Quack;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println(" cant quack ");
    }
}
