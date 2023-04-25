package decorator;

import java.util.ArrayList;
import java.util.List;

public class MainDecorator {

  public static void main(String[] args) {

    List<String> productList = List.of(
        "macbook 14", "macbook 14 pro", "imac 15", "ipad pro"
    );

    Search simpleSearch = new SimpleSearch();
    System.out.println(simpleSearch.search(productList, "macbook 14"));

    Search complexSearch = new SearchContaining(new SimpleSearch());
    System.out.println(complexSearch.search(productList, "mac"));
  }
}
