abstract class MotorBike {
    abstract void brake();
}
class SportsBike extends MotorBike{
    public void brake(){
        System.out.println(" sports bike brake");
    }
}
class  MountainBike extends MotorBike{
    public void brake(){
        System.out.println(" mountain bike brake");
    }
}
class BrakeFun{
    public static void main(String[] args){
        SportsBike sb1 = new SportsBike();
        sb1.brake();

        MountainBike mb1 = new MountainBike();
        mb1. brake();
    }
}