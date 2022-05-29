package duck_behaviours;

import duck_behaviours.behaviours.implementations.FlyBehaviour.FlyRocketPowered;
import duck_behaviours.ducks.Duck;
import duck_behaviours.ducks.MallardDuck;
import duck_behaviours.ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
