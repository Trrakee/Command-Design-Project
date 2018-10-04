// Each command you want to issue will implement the Command interface
public interface Command {
  void execute();
  // You may or may not want to offer the option to undo a command.
  // Basically this just does the opposite of a command.
  void undo();
}