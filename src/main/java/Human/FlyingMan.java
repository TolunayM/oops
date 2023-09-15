package Human;

import Attributes.Fly;

// this is flying man
// we can create different kind of human beings with this implementation
// and always keeps human specific attributes
public class FlyingMan extends Human implements Fly {

    public FlyingMan(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flying");
    }

}
