package flyweight;

public class MainFlw {

  public static void main(String[] args) {
    ElementTag div = Factory.getTag("<div>", "</div>");
    Element element = new Element(1, div, "Welcome, choose pay method");

    ElementTag divWithClass = Factory.getTag("<div class=\"checkbox\">", "</div>");
    Element checkbox = new Element(2,divWithClass, "card");

    ElementTag divWithClass2 = Factory.getTag("<div class=\"checkbox\">", "</div>");
    Element checkbox2 = new Element(3, divWithClass2, "paypal");

    element.renderElement();
    checkbox.renderElement();
    checkbox2.renderElement();

    System.out.println(divWithClass == divWithClass2);
  }
}
