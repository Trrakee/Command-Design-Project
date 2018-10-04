//Command
import java.util.List;
public class TurnEverythingOff implements Command {
  List<Vehicle> theTesla;

  public TurnEverythingOff(List<Vehicle> newCar) {
    theTesla = newCar;
  }

  @Override
  public void execute() {
    System.out.println(
        "\n|-----------------------------------------|\n" + "  Everything is turning off...\n");
    for (int i = 0; i < theTesla.size(); i++) {
      int carNum = i + 1;
      System.out.printf("Car number %d's ", carNum);
      theTesla.get(i).allWipersOff();
    }
    for (int i = 0; i < theTesla.size(); i++) {
      int carNum = i + 1;
      System.out.printf("Car number %d ", carNum);
      theTesla.get(i).allCarsOff();
    }
    System.out.println("|-----------------------------------------|");
  }

  @Override
  public void undo() {
    System.out.println(
        "|-----------------------------------------|\n" + "  Everything is turning on...\n");
    for (int i = 0; i < theTesla.size(); i++) {
      int carNum = i + 1;
      System.out.printf("Car number %d ", carNum);
      theTesla.get(i).allCarsOn();
    }
    for (int i = 0; i < theTesla.size(); i++) {
      int carNum = i + 1;
      System.out.printf("Car number %d's ", carNum);
      theTesla.get(i).allWipersOn();
    }
    System.out.println("|-----------------------------------------|");
  }
}