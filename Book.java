public class Book {
  private String title;
  private String writer;
  private int pageCount;

  Book(String title, String writer, int pageCount) {
    this.title = title;
    this.writer = writer;
    this.pageCount = pageCount;
  }

  public String getTitle() {
    return this.title;
  }

  public String getWriter() {
    return this.writer;
  }

  public String toString() {
    return String.format("%s by %s", this.title, this.writer);
  }
}
