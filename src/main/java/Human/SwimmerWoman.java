package Human;

import Attributes.Swim;

public class SwimmerWoman extends Human implements Swim {


    public SwimmerWoman(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swimming");
    }
}
