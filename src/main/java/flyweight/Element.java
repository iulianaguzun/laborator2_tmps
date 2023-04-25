package flyweight;

public class Element {

  private int id;

  private String value;

  private ElementTag elementTag;

  public Element(int id, ElementTag elementTag, String value) {
    this.id = id;
    this.elementTag = elementTag;
    this.value = value;
  }

  public void renderElement(){
    elementTag.render(value);
  }
}
