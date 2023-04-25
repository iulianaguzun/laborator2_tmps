package decorator;

import java.util.List;

public class SearchContaining extends SearchDecorator {

  public SearchContaining(Search search) {
    super(search);
  }

  @Override
  public List<String> search(List<String> products, String name) {
    System.out.println("Searching by containing name:" + name);
    return products.stream()
        .filter(prod -> prod.contains(name))
        .toList();
  }
}
