package flyweight;

public class ElementTag {
  private String startTag;

  private String endTag;

  public ElementTag(String startTag,String endTag) {
    this.startTag = startTag;
    this.endTag = endTag;
  }

  public void render(String value){
    System.out.println(startTag + value + endTag);
  }
}
