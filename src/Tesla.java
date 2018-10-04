// Receiver
//    This does the work of the Invoker.
public class Tesla implements Vehicle {

  public void on() {
    System.out.print("The Car is on.");
  }

  public void off() {
    System.out.print("The Car is off.");
  }

  public void wipersOn() {
    System.out.print("The windshield wipers are on.");
  }

  public void wipersOff() {
    System.out.print("The Windshield wipers are off.");
  }

  @Override
  public void allWipersOff() {
    System.out.println("wipers have been turned off.");
  }

  @Override
  public void allCarsOff() {
    System.out.println("has been turned off.");
  }

  @Override
  public void allWipersOn() {
    System.out.println("wipers have been turned on.");
  }

  @Override
  public void allCarsOn() {
    System.out.println("has been turned on.");
  }
}