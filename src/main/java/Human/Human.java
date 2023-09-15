package Human;

import Attributes.Breathe;
import Attributes.Talk;
import Attributes.Walk;

// I used common human attributes as an implementations
// with this way I can use this attributes freely anywhere, and I don't need to repeat this attributes again
public abstract class Human implements Breathe, Talk, Walk {

    private String name;

    public Human(String name){
        this.name = name;
    }

    public String tureng(){
        return "Yes,i'm absolutely human";
    }

    public String getName() {
        return name;
    }

    @Override
    public void talk() {
        System.out.println("My name is " + name + " i can talk");
    }

    @Override
    public void breathe() {
        System.out.println(name + " breathing oxgyen");
    }

    @Override
    public void walk() {
        System.out.println(name + " walking");
    }
}
