package Plant;

import Attributes.Fly;

public class FlyingPlant extends Plant implements Fly {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
