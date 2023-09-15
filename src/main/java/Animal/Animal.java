package Animal;

import Attributes.Breathe;
import Attributes.Walk;

public abstract class Animal implements Breathe, Walk {
    @Override
    public void breathe() {
        System.out.println("Breathing");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }
}
