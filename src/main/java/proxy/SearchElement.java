package proxy;

import java.time.LocalDateTime;

public class SearchElement {
  private final String url;
  private final LocalDateTime time;

  public SearchElement(String url, LocalDateTime time) {
    this.url = url;
    this.time = time;
  }

  public String getUrl() {
    return url;
  }

  public LocalDateTime getTime() {
    return time;
  }

  @Override
  public String toString() {
    return "SearchElement{" +
        "url='" + url + '\'' +
        ", time=" + time +
        '}';
  }
}
