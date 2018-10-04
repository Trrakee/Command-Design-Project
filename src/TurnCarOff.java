//Command
public class TurnCarOff implements Command {
  Vehicle teslaCar;

  public TurnCarOff(Vehicle newTeslaCar) {
    teslaCar = newTeslaCar;
  }

  @Override
  public void execute() {
    teslaCar.off();
  }
// Do the opposite of execute()
  @Override
  public void undo() {
    teslaCar.on();
  }

}
