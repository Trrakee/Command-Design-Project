// This is known as the invoker class
// It has a method press() that when executed
//     makes the execute method to be called.
// The execute method for the Command interface then calls
// the method assigned in the class that implements the
// Command interface
public class VehicleSwitch {
  private Command commandRecieved;

  public VehicleSwitch(Command newCommand) {
    commandRecieved = newCommand;
  }

  public void pressed() {
    commandRecieved.execute();
  }
  //This way the Switch in the car can undo past commands.
  public void pressedUndo() {
    commandRecieved.undo();
  }
}