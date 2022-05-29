package duck_behaviours.behaviours.implementations.QuackBehaviour;

import duck_behaviours.behaviours.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
