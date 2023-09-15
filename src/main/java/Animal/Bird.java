package Animal;

import Attributes.Fly;

public class Bird extends Animal implements Fly {
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
