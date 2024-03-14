public class Inky{
    //Constructor for Inky
    public Inky(String pinky){
        System.out.println("Pinky"+pinky);
    }

    //Another constructor for Ponky2
    public Inky(String pinky, String rinky){
        System.out.println("Donkey"+rinky);
        System.out.println("Donkey"+pinky);
        System.out.println("Pinky"+""+rinky);
    }

    public static void main(String[]args){
        //Create object ponky
        Inky ponky=new Inky("Donkey");

        //Create local variable blinky
        String blinky="pinky";

        //Create another variable rinky
        String rinky="monkey";

        //Create another object ponky2 and pass variables
        Inky ponky2 = new Inky(blinky,rinky);
    }
}
