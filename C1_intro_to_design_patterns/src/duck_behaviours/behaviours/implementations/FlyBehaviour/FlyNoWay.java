package duck_behaviours.behaviours.implementations.FlyBehaviour;

import duck_behaviours.behaviours.interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly :(");
    }
}