package flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {

  private static Map<String, ElementTag> tagMap = new HashMap<>();

  public static ElementTag getTag(String startTag, String endTag) {
    ElementTag tag = tagMap.get(startTag + endTag);
    if (tag == null) {
      tag = new ElementTag(startTag, endTag);
      tagMap.put(startTag + endTag, tag);
    }
    return tag;
  }
}
