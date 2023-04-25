package proxy;

import java.util.ArrayList;
import java.util.List;

public class HistoryProxy implements History{

  private final HistoryImpl history;

  private List<SearchElement> lastHistory;

  public HistoryProxy(HistoryImpl history) {
    this.history = history;
    this.lastHistory = new ArrayList<>();
  }
  @Override
  public SearchElement getRecentByName(String name) {
    boolean contains = lastHistory.stream().anyMatch(searchElement -> searchElement.getUrl().equals(name));
    if (lastHistory.isEmpty() || !contains) {
      SearchElement recent = history.getRecentByName(name);
      lastHistory.add(recent);
      System.out.println("from history");
      return recent;
    }
    System.out.println("getting from last history");
    return lastHistory.stream()
        .filter(searchElement -> searchElement.getUrl().equals(name))
        .findAny().get();
  }
}
