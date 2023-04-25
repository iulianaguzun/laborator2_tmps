package adapter;

public class Calculator {

  private final String gameName;

  public Calculator(String gameName) {
    this.gameName = gameName;
  }

  public void startGame() {
    System.out.println("Starting game:" + gameName);
  }

  public void exitGame() {
    System.out.println("Exiting the game:" + gameName);
  }
}
