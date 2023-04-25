package decorator;

import java.util.List;

public class SimpleSearch implements Search {

  @Override
  public List<String> search(List<String> products, String name) {
    System.out.println("Searching by name:" + name);
    return products.stream()
        .filter(prod -> prod.equals(name))
        .toList();
  }
}
