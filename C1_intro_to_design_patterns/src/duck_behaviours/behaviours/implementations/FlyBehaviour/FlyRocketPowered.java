package duck_behaviours.behaviours.implementations.FlyBehaviour;

import duck_behaviours.behaviours.interfaces.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket! Weeeeeeeee");
    }
}
