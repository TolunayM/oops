import Human.FlyingMan;
import Human.SwimmerWoman;
import Plant.FlyingPlant;
import Plant.SpecialPlant;

public class Main {
    public static void main(String[] args) {

        FlyingMan myMan = new FlyingMan("John Doe");
        myMan.fly();
        myMan.breathe();
        System.out.println(myMan.getName());
        SwimmerWoman woman = new SwimmerWoman("Jane Doe");
        System.out.println(woman.tureng());
        FlyingPlant plant = new FlyingPlant();
        plant.breathe();
        SpecialPlant sp = new SpecialPlant();
        sp.breathe();
    }
}


//    public void capabilities(){
//        String allAtt = "";
//        try{
//            Class[] interfaces = Class.forName("Human.FlyingMan").getInterfaces();
//            for (Class face:interfaces) {
//                allAtt += face.getSimpleName() + " ";
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println("Capabilities of " + getName() + " " + allAtt.trim());
//    }

