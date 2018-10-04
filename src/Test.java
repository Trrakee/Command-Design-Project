import java.util.ArrayList;
import java.util.List;
public class Test {
  public static void main(String[] args) {
    /** // Turn first Car On. */
    /** -------------------------------------------------- */
    System.out.println(
        "Car number 1 = Tesla1\n" + "Car number 2 = Tesla2\n" + "|---------------------|\n");
    // Create the Cars to use
    Vehicle Tesla1 = Car.getCar();
    Vehicle Tesla2 = Car.getCar();
    // TurnCarOn has a command that turns the car on.
    // When execute() is called on this command object
    // it will execute the method on() in Tesla.java
    TurnCarOn onCommand = new TurnCarOn(Tesla1);
    // Calling the execute() causes on() to execute in Tesla.java
    VehicleSwitch onPressed = new VehicleSwitch(onCommand);
    // When press() is called theCommand.execute();
    onPressed.pressed();
    System.out.println("    = Tesla1");
    /** // Turn second Car On. */
    /** -------------------------------------------------- */
    // Now when execute() is called off() it will turn the car off.
    onCommand = new TurnCarOn(Tesla2);
    // Calling the execute() causes off() to execute in Tesla.java
    onPressed = new VehicleSwitch(onCommand);
    onPressed.pressed();
    System.out.println("    = Tesla2");
    /** // Turn wipers for first car On. */
    /** -------------------------------------------------- */
    // Now when execute() is calling turnWipersOn() it is passing
    // the car to Tesla.java 's wiperOn()
    TurnWipersOn wipersOnCommand = new TurnWipersOn(Tesla1);
    onPressed = new VehicleSwitch(wipersOnCommand);
    // When press() is called theCommand.execute();, executes.
    onPressed.pressed();
    System.out.println("    = Tesla1");
    /** // Turn wipers for second car On. */
    /** -------------------------------------------------- */
    // Now when execute() is calling turnWipersOn() it is passing
    // the car to Tesla.java 's wiperOn()
    wipersOnCommand = new TurnWipersOn(Tesla2);
    onPressed = new VehicleSwitch(wipersOnCommand);
    // When press() is called theCommand.execute();, executes.
    onPressed.pressed();
    System.out.println("    = Tesla2");
    /** // Turn off everything for each car. */
    /** -------------------------------------------------- */

    // Add the Tesla Cars to a List.
    List<Vehicle> allTesla = new ArrayList<>();
    allTesla.add(Tesla2);
    allTesla.add(Tesla1);

    // Send the List of tesla's to TurnEverythingOff.java
    // where a call to run execute() on this function will
    // call off() for each device in the list
    TurnEverythingOff turnOffVehicles = new TurnEverythingOff(allTesla);
    // This calls for execute() to run which calls for off() to
    //    run for every Vehicle.
    VehicleSwitch turnAllOff = new VehicleSwitch(turnOffVehicles);
    turnAllOff.pressed();

    /** -------------------------------------------------- */
    /* In Command Design Pattern it is common to be able to undo
     * a command in a command pattern.
     * So to do this VehicleSwitch.java will have a method called
     * "pressedUndo();" which will perform the opposite action that
     * the normal Command performs.
     * Adding the undo method will require every class to implement
     * a undo that does the opposite of the execute. So for every execute()
     * there should be an undo()
     */
    /** // Undo everything. Instead of turning it all off. Turn it all on. */
    System.out.println("\n// ----------------------------------------------------- //\n");
    System.out.println("Undo in Action\n" + "|---------------------|\n");
    turnAllOff.pressedUndo();
  }
}