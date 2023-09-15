package Animal;

import Attributes.Jump;

public class JumpingEagle extends Eagle implements Jump {
    @Override
    public void jump() {
        System.out.println("This eagle loves jumping around");
    }
}
