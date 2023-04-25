package adapter;

public class MainGame {

  public static void main(String[] args) {
    Calculator calculator = new Calculator("Candy crush");
    VideoGame videoGame = new AdapterCalculator(calculator);

    videoGame.start();
    videoGame.stop();
  }
}
