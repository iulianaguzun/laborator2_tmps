package proxy;

import java.time.LocalDateTime;

public class Main {

  public static void main(String[] args) {
    History history = new HistoryProxy(new HistoryImpl());

    SearchElement recent1 = history.getRecentByName("google.com");
    System.out.println(recent1);

    SearchElement recent2 = history.getRecentByName("youtube.com");
    System.out.println(recent2);

    SearchElement recent3 = history.getRecentByName("google.com");
    System.out.println(recent3);
  }
}
