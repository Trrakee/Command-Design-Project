//Command
public class TurnWipersOn implements Command {

  Vehicle teslaCar;

  public TurnWipersOn(Vehicle newTeslaCar) {
    teslaCar = newTeslaCar;
  }

  @Override
  public void execute() {
    teslaCar.wipersOn();
  }

  @Override
  public void undo() {
    teslaCar.wipersOff();
  }
}