public class AirConditioning implements HomeService{
    @Override
    public void turnOn() {
        System.out.println("AirCondingtioning is on.");
    }
    @Override
    public void turnOff() {
        System.out.println("AirConditioning is off.");
    }
}