package Animal;

import Attributes.Talk;

public class Eagle extends Bird implements Talk {
    @Override
    public void talk() {
        System.out.println("This eagle can talk");
    }
}
