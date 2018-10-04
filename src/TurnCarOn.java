public class TurnCarOn implements Command {

  Vehicle teslaCar;

  public TurnCarOn(Vehicle newTeslaCar) {
    teslaCar = newTeslaCar;
  }

  @Override
  public void execute() {
    teslaCar.on();
  }

  @Override
  public void undo() {
    teslaCar.off();
  }
}