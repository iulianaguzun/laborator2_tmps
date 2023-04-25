package decorator;

import java.util.List;

public class SearchDecorator implements Search{

  private final Search search;

  public SearchDecorator(Search search) {
    this.search = search;
  }

  @Override
  public List<String> search(List<String> products, String name) {
    return search.search(products,name);
  }
}
