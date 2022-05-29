package duck_behaviours.behaviours.implementations.FlyBehaviour;

import duck_behaviours.behaviours.interfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying :)");
    }
}
