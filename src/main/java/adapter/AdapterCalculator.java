package adapter;

public class AdapterCalculator implements VideoGame{

  private Calculator calculator;

  public AdapterCalculator(Calculator calculator) {
    this.calculator = calculator;
  }

  @Override
  public void start() {
    this.calculator.startGame();
  }

  @Override
  public void stop() {
    this.calculator.exitGame();
  }
}
