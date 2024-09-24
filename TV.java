public class TV implements HomeService{
    @Override
    public void turnOn(){
        System.out.println("Tv is on.");
    }

    @Override
    public void turnOff(){
        System.out.println("Tv is off.");
    }
}
