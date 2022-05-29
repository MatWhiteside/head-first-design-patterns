package duck_behaviours.ducks;

import duck_behaviours.behaviours.implementations.FlyBehaviour.FlyWithWings;
import duck_behaviours.behaviours.implementations.QuackBehaviour.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
