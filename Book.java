public class Book {
  public String title;
  public String writer;

  public String toString() {
    return String.format("%s by %s", this.title, this.writer);
  }
}
