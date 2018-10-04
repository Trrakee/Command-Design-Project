//Command
public class TurnWipersOff implements Command {
  Vehicle teslaCar;

  public TurnWipersOff(Vehicle newTeslaCar) {
    teslaCar = newTeslaCar;
  }

  @Override
  public void execute() {
    teslaCar.wipersOff();
  }

  @Override
  public void undo() {
    teslaCar.wipersOn();
  }

}
