package proxy;

import java.time.LocalDateTime;
import java.util.List;

public class HistoryImpl implements History{

  public HistoryImpl() {
    System.out.println("Getting from actual History");
  }

  private static List<SearchElement> history = List.of(
      new SearchElement("google.com", LocalDateTime.now()),
      new SearchElement("youtube.com", LocalDateTime.now().plusMinutes(5)),
      new SearchElement("amazon.com", LocalDateTime.now().plusMinutes(30)),
      new SearchElement("outlook.com", LocalDateTime.now().plusMinutes(45))
  );


  @Override
  public SearchElement getRecentByName(String name) {
    return history.stream()
        .filter(searchElement -> searchElement.getUrl().equals(name))
        .findAny().get();
  }
}
